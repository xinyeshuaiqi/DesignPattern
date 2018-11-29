package pers.wmx.singleton;

/**
 * 饿汉式（静态代码块）
 *
 * @author: wangmingxin1
 * @create: 2018-11-29 17:21
 **/
public class Singleton1 {
    private static Singleton1 instance;

    static {
        instance = new Singleton1();
    }

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }
}
