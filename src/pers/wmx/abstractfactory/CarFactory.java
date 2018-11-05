package pers.wmx.abstractfactory;

/**
 * @author: wangmingxin1
 * @create: 2018-11-05 15:40
 **/
public interface CarFactory {
    //制作宝马车
    public Car createBmWCar();
    //制作奔驰车
    public Car createMercedesCar();
}
