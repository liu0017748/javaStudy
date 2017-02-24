package DesignPatten.Observer;

import java.util.*;

/**
 * Created by liu on 17/2/24.
 */
public class Test {
    public static void main(String[] args){
        Wached wached=new Wached();

        Observer wacher=new Wacher(wached);
        Observer wacher2=new Wacher2(wached);
        wached.setData("start");
        wached.setData("run");
        wached.setData("stop");
    }
}
class Wacher2 implements Observer{
    public Wacher2(Observable o){
        o.addObserver(this);
    }

    public void update(Observable o,Object arg){
        System.out.println("状态发生改变2"+((Wached)o).getData());
    }
}
