package DesignPatten.Observer;

import java.util.*;

/**
 * Created by liu on 17/2/24.
 */
public class Wached extends Observable{
    private  String data="";
    public String getData(){
        return data;
    }

    public void setData(String data){
        if(!this.data.equals(data)){
            this.data=data;
            setChanged();
        }
        notifyObservers();
    }

}
