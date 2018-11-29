package pers.wmx.singleton;

/**
 * 懒汉式  双重检查
 *
 * 优点：线程安全；延迟加载；效率较高。
 *
 * @author: wangmingxin1
 * @create: 2018-11-29 17:22
 **/
public class Singleton2 {
    private static volatile Singleton2 singleton;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
