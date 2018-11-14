package pers.wmx.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangmingxin1
 * @create: 2018-11-14 17:14
 **/
public class Main {
    public static void main(String[] args){
        BMWBuilder bmw = new BMWBuilder();

        ArrayList<String> sequence = new ArrayList<>();

        //指定顺序  开这个车的人讲礼仪，注意安全 每次启动前先鸣笛，刹车前也鸣笛
        sequence.add("鸣笛");
        sequence.add("行驶");
        sequence.add("鸣笛");
        sequence.add("刹车");

        bmw.setActionSequence(sequence);
        CarModel car = bmw.getCarModel();
        car.action();
        
        System.out.println("***************************");

        sequence.clear();
        //下面开的车的司机比较吊，急开急停，懒得按喇叭，不久被撞死。。。
        sequence.add("行驶");
        sequence.add("刹车");
        bmw.setActionSequence(sequence);
        CarModel car1 = bmw.getCarModel();
        car1.action();


    }

}
