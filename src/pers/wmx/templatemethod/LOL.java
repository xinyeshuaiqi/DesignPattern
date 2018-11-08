package pers.wmx.templatemethod;

/**
 * 到网吧打英雄联盟
 *
 * @author: wangmingxin1
 * @create: 2018-11-08 15:46
 **/
public class LOL extends Game{

    private boolean thirsty;

    @Override
    protected void goBar() {
        System.out.println("周末去波网吧耍联盟...");
    }

    @Override
    protected void openComputer() {
        System.out.println("老板上机...");
    }

    @Override
    protected void loginGame() {
        System.out.println("游戏登录中...");
    }

    @Override
    protected void start() {
        System.out.println("欢迎进入召唤师峡谷...");
    }

    @Override
    protected void drink() {
       System.out.println("渴了,买瓶可乐喝...");
    }

    @Override
    protected boolean isThirsty() {
        return this.thirsty;
    }

    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }
}
