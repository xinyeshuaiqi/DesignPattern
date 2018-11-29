package pers.wmx.state;

/**
 * @author: wangmingxin1
 * @create: 2018-11-29 10:58
 **/
public class SleepState extends State {

    @Override
    public void sleep() {
        System.out.println("睡觉...");
    }

    //睡好了，起来接着打游戏
    @Override
    public void play() {
        super.context.setState(Context.playStete);
        super.context.getState().play();
    }

    @Override
    public String toString() {
        return "当前状态:困得一批z Z Z";
    }
}
