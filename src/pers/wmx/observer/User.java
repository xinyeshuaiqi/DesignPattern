package pers.wmx.observer;

/**
 * 微信公众号的用户
 *
 * @author: wangmingxin1
 * @create: 2018-11-26 11:57
 **/
public class User implements Observer{

    String name;
    String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到微信公众号推送消息 " + message);
    }
    
}
