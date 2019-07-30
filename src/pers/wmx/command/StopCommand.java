package pers.wmx.command;

/**
 * @author: wangmingxin1
 * @create: 2018-11-16 11:53
 **/
public class StopCommand implements Command {
    @Override
    public void execute() {
        myAudio.stop();
    }
}
