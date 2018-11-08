package pers.wmx.templatemethod;

/**
 * @author: wangmingxin1
 * @create: 2018-11-08 15:35
 **/
public abstract class Game {

    //基本方法
    //定义成protected,不让外部类访问，只能子类继承重写
    protected abstract void goBar();            //去网吧
    protected abstract void openComputer();     //上机
    protected abstract void loginGame();        //登录游戏
    protected abstract void start();            //开始打游戏
    protected abstract void drink();            //喝饮料

    //钩子方法(Hook Method)    子类可以重写
    protected boolean isThirsty(){   //我们上网不能一直喝水啊，渴的时候再喝
        //最开始到网吧还不渴，渴了再买水
        return false;
    }

    //按照一定的顺序组织
    //定义成final  子类不能重写这个方法，修改这个规则   直接调用这个方法
    final public void play(){    //这个方法就是传说中的模板方法
        this.goBar();
        this.openComputer();
        this.loginGame();
        this.start();

        if(this.isThirsty()) {
            this.drink();
        }
    }

}
