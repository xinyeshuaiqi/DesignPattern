package pers.wmx.state;

/**
 * @author: wangmingxin1
 * @create: 2018-11-29 10:48
 **/
public class Context {
    //去网吧包夜，定义包夜时的所有状态
    public final static PlayState playStete = new PlayState();
    public final static SleepState sleepState = new SleepState();

    //当前状态
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);

    }

    public void play(){
        this.state.play();
    }

    public void sleep(){
        this.state.sleep();
    }
}
