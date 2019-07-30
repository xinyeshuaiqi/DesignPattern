package pers.wmx.command;

/**
 * @author: wangmingxin1
 * @create: 2018-11-16 11:46
 **/
public interface Command {

    AudioPlayer myAudio = new AudioPlayer();

    /**
     * 执行方法
     */
    public void execute();
}
