package pers.wmx.proxy;

/**
 * 某个正在找房子的人
 *
 * @author: wangmingxin1
 * @create: 2018-10-30 11:38
 **/
public class SomebodyLookingForHouse {
    public static void main(String[] args){
        //自己找房子，他慢了，而且容易被坑，通过正规的中介来找房子，如链家、蛋壳

        //我想找昌平的房子，便宜啊，new 一个昌平的房子
        ChangpingHouse house =new ChangpingHouse();

        //蛋壳租房中介
        Agency danke =new Agency(house);
        danke.rentOut();    //实际上调用的是ChangpingHouse 的rentOut()方法

        //如果我又想租西二旗的房子了，离公司比较近，在new 一个西二旗的房子，传入代理对象
        XierqiHouse house1 =new XierqiHouse();
        danke =new Agency(house1);
        danke.rentOut();
    }
}
