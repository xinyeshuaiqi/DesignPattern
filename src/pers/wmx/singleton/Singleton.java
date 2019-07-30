package pers.wmx.singleton;

/**
 * 饿汉式
 *
 * @author: wangmingxin1
 * @create: 2018-11-29 17:20
 **/
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
