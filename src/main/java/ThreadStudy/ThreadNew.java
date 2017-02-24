package ThreadStudy;


import java.util.*;
import java.util.concurrent.*;

/**
 * Created by liu on 16/12/26.
 */
public class ThreadNew {
    class ThreadA extends Thread{
        private Date runtime;
        public void run(){
            System.out.println("ThreadA begin.");
            this.runtime=new Date();
            System.out.println("ThreadA end.");
        }
    }

    class ThreadB implements Runnable{
        private Date runtime;
        public void  run(){
            System.out.println("ThreadB begin.");
            this.runtime=new Date();
            System.out.println("ThreadB end.");
        }
    }
    class CallableThread<T> implements Callable<T>{
        public T call() throws Exception{
            T t=null;
            return  t;
        }
    }
    public void starta(){
        Thread threada=new ThreadA();
        threada.start();
    }
    public  void startb(){
        Runnable thradb=new ThreadB();
        Thread thread=new Thread(thradb);
        thread.start();
    }
    public  static void main(String[] args){
        ThreadNew test=new ThreadNew();
        test.starta();
        test.startb();
    }
}
