package IOCStudy.ComPonentScanStudy;

import org.springframework.stereotype.*;

/**
 * Created by liu on 17/1/14.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "xxxxx";
    private String artist = "ttttttt";

    public void play() {
        System.out.println("playing" + title + "by" + artist);
    }
}
