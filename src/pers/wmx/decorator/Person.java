package pers.wmx.decorator;

/**
 * @author: wangmingxin1
 * @create: 2018-11-19 12:59
 **/
public class Person {
    public static void main(String[] args){

        //生活所迫，先来个茅草屋凑合着住
        ThatchHouse thatchHouse = new ThatchHouse();

        //在原来的茅草屋的基础上修建瓦房
        BrickHouse brickHouse = new BrickHouse(thatchHouse);
        brickHouse.live();

        System.out.println("*******************************");
        
        //隔壁的老李也是茅草屋，突然发家致富，一波盖了豪华洋房，来娶媳妇用
        //在原来的茅草屋的基础上修建豪房
        LuxuryHouse luxuryHouse = new LuxuryHouse(thatchHouse);
        luxuryHouse.live();
    }
}
