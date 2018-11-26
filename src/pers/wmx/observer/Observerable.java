package pers.wmx.observer;

/**
 * 被观察者
 *
 * @author: wangmingxin1
 * @create: 2018-11-26 11:49
 **/
public interface Observerable {
    //添加监听者
    public void addObserver(Observer o);

    //移除监听者
    public void removeObserver(Observer o);

    //通知所有监听者
    public void notifyObserver();
}
