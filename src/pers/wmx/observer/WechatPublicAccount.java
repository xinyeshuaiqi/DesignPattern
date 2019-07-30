package pers.wmx.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号   被监听者
 *
 * @author: wangmingxin1
 * @create: 2018-11-26 11:52
 **/
public class WechatPublicAccount implements Observerable{

    List<Observer> observers = new ArrayList<>();
    String msg;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this.msg);
        }
    }

    public void setMsg(String msg){
        System.out.println("微信公众号发布文章 ...");
        this.msg = msg;

        notifyObserver();
    }
}
