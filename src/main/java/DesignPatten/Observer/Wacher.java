package DesignPatten.Observer;

import java.util.*;

/**
 * Created by liu on 17/2/24.
 */
public class Wacher implements Observer{
    public Wacher(Observable o){
        o.addObserver(this);
    }

    public void update(Observable o,Object arg){
        System.out.println("状态发生改变"+((Wached)o).getData());
    }
}
