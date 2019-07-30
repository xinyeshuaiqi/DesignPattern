package pers.wmx.command;

/**
 * @author: wangmingxin1
 * @create: 2018-11-16 11:52
 **/
public class RewindCommand implements  Command{
    @Override
    public void execute() {
        myAudio.rewind();
    }
}
