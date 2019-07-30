package pers.wmx.state;


//小明包夜时的状态
public abstract class State {

    //定义一个环境角色，状态变换引起行为变化
    protected Context context ;

    public void setContext(Context context) {
        this.context = context;
    }

    //具体行为 : 为了模拟简单，我们就定义2个状态及对应的行为

    //睡觉
    public abstract void sleep();

    //打游戏
    public abstract void play();



}
