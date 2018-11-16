package pers.wmx.command;

/**
 * @author: wangmingxin1
 * @create: 2018-11-16 11:46
 **/
public class PlayCommand implements Command {

    //把方法封装到命令里

    @Override
    public void execute() {
        myAudio.play();
    }
}
