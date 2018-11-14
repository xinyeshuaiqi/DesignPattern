package pers.wmx.builder;

/**
 * @author: wangmingxin1
 * @create: 2018-11-14 17:06
 **/
public class BMWCarModel extends CarModel {
    @Override
    protected void run() {
        System.out.println("宝马车行驶...");
    }

    @Override
    protected void brake() {
        System.out.println("宝马车刹车。");
    }

    @Override
    protected void whistle() {
        System.out.println("宝马车响笛！");
    }
}
