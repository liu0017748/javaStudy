package ThreadStudy;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

import java.util.concurrent.*;
/**
 * Created by liu on 17/2/11.
 */
public class RenderWithTimeBudget {
    private static final Ad DEFAULT_AD = new Ad();
    private static final long TIME_BUDGET = 1000;
    private static final ExecutorService exec = Executors.newCachedThreadPool();

    Page renderPageWithAd() throws InterruptedException {
        long endNanos = System.nanoTime() + TIME_BUDGET;
        Future<Ad> f = exec.submit(new FetchAdTask());
        // Render the page while waiting for the ad
        Page page = renderPageBody();
        Ad ad;
        try {
            // Only wait for the remaining time budget
            long timeLeft = endNanos - System.nanoTime();
            ad = f.get(timeLeft, NANOSECONDS);
            System.out.println("execution normal");
        } catch (ExecutionException e) {
            ad = DEFAULT_AD;
            System.out.println("execution exception");
        } catch (TimeoutException e) {
            ad = DEFAULT_AD;
            System.out.println("timeout exception");
            f.cancel(true);
        }
        page.setAd(ad);
        return page;
    }

    public static void main(String[] args) throws Exception{
        RenderWithTimeBudget r=new RenderWithTimeBudget();
        r.renderPageWithAd();
    }

    Page renderPageBody() { return new Page(); }


    static class Ad {
    }

    static class Page {
        public void setAd(Ad ad) { }
    }

    static class FetchAdTask implements Callable<Ad> {
        public Ad call() {
            return new Ad();
        }
    }
}
