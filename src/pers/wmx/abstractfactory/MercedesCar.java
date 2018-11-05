package pers.wmx.abstractfactory;

/**
 * @author: wangmingxin1
 * @create: 2018-11-05 15:04
 **/
public abstract class MercedesCar implements Car{
    @Override
    public void info() {
        System.out.println("奔驰车");
    }
}
