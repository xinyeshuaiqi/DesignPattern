package pers.wmx.factorymethod;

/**
 * 顾客点餐
 *
 * @author: wangmingxin1
 * @create: 2018-10-31 12:44
 **/
public class Customer {

    public static void main(String[] args) throws Exception {
        //一个饥饿的大叔来到KFC 一顿猛点

        //先来个汉堡
        Food hamburger = KFC.createFood(Hamburger.class);
        hamburger.info();

        //没吃饱，再来包薯条
        Food frenchFries = KFC.createFood(FrenchFries.class);
        frenchFries.info();

        //再来杯可乐，美滋滋
        Food coke = KFC.createFood(Coke.class);
        coke.info();
        
        System.out.println("吃饱喝足，溜了 ...");
    }
}
