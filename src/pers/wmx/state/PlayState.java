package pers.wmx.state;

/**
 * @author: wangmingxin1
 * @create: 2018-11-29 11:01
 **/
public class PlayState extends State{

    //玩累了，睡觉
    @Override
    public void sleep() {
        super.context.setState(Context.sleepState);   //修改状态
        super.context.getState().sleep();
    }

    @Override
    public void play() {
        System.out.println("单排上王者...");
    }

    @Override
    public String toString() {
        return "当前状态:战斗中！";
    }
}
