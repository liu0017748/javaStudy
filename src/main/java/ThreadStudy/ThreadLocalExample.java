package ThreadStudy;

import java.util.concurrent.*;

/**
 * Created by liu on 17/2/6.
 */
public class ThreadLocalExample {
    public static class MyRunnable implements Runnable{
        private  ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>();
        public void run(){
            threadLocal.set((int)(Math.random()*100D));
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(threadLocal.get());
        }
    }
    public static class JoinTest implements Runnable{
        public static int a=0;
        public void run(){
            for(int k=0;k<5;k++){
                a=a+1;
            }
        }
    }
    public static void main(String[] args){
//        MyRunnable sharedRunnableInstance=new MyRunnable();
//        Thread thread1=new Thread(sharedRunnableInstance);
//        Thread thread2=new Thread(sharedRunnableInstance);
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        }catch (Exception e){
//
//        }
        JoinTest joinTest=new JoinTest();
        Thread thread3=new Thread(joinTest);
        thread3.start();
        try {
            thread3.join();
        }catch (Exception e){}

        System.out.println(JoinTest.a);


    }
}
