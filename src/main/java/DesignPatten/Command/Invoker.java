package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class Invoker {
    private Command command=null;
    public Invoker(Command command){
        this.command=command;
    }
    public void action(){
        command.execute();
    }
}
