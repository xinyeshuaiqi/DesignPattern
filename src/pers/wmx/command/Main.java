package pers.wmx.command;

/**
 * @author: wangmingxin1
 * @create: 2018-11-16 11:54
 **/
public class Main {
    public static void main(String[] args){
        PressInvoker invoker = new PressInvoker();

        System.out.println("听一波录音机...");
        Command command = new PlayCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("错过了精彩部分，倒带...");
        command = new RewindCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("不听了，出去嗨，不做死肥宅");
        command = new StopCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
