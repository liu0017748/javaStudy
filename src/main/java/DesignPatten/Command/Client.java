package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class Client {
    public static void main(String[] args){
        Receiver receiver=new Receiver();
        Command command=new ConcreteCommand(receiver);
        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}
