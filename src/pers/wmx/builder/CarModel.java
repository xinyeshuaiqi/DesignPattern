package pers.wmx.builder;

import java.util.ArrayList;

/**
 * @author: wangmingxin1
 * @create: 2018-11-14 16:58
 **/
public abstract class CarModel {
    private ArrayList<String> actionSequence = new ArrayList<>();   //动作执行顺序

    protected abstract void run();

    protected abstract void brake();

    protected abstract void whistle();

    final public void action() {
        for (int i = 0; i < this.actionSequence.size(); i++) {
            String actionName = this.actionSequence.get(i);
            if (actionName.equals("行驶")) {
                this.run();
            } else if (actionName.equals("刹车")) {
                this.brake();
            } else if (actionName.equals("鸣笛")) {
                this.whistle();
            }
        }
    }

    final public void setActionSequence(ArrayList<String> sequence){
        this.actionSequence = sequence;
    }
}
