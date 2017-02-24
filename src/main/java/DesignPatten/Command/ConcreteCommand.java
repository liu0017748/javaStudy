package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver=null;
    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }
    public void execute(){
        receiver.action();
    }
}
