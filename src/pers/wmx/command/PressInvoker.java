package pers.wmx.command;

/**
 * 录音机按钮    命令请求者
 *
 * @author: wangmingxin1
 * @create: 2018-11-16 11:47
 **/
public class PressInvoker {
    Command command = null;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
