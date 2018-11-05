package pers.wmx.abstractfactory;

/**
 * @author: wangmingxin1
 * @create: 2018-11-05 15:51
 **/
public class Main {
    public static void main(String[] args){

        //第一条生产线，轿车生产线
        CarFactory carFactory1 = new CarFactory1();

        //第二条生产线，跑车生产线
        CarFactory carFactory2 = new CarFactory2();

        BMW1 bmWCar = (BMW1) carFactory1.createBmWCar();
        bmWCar.info();
        bmWCar.show();

        Mercedes2 mercedesCar = (Mercedes2) carFactory2.createMercedesCar();
        mercedesCar.info();
        mercedesCar.show();
    }
}
