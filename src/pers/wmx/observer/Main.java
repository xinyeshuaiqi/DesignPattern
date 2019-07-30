package pers.wmx.observer;

/**
 * @author: wangmingxin1
 * @create: 2018-11-26 11:59
 **/
public class Main {
    public static void main(String[] args){
        WechatPublicAccount observerable = new WechatPublicAccount();

        observerable.addObserver(new User("张三"));
        observerable.addObserver(new User("李四"));
        observerable.addObserver(new User("王五"));

        observerable.setMsg("余罪3即将上映 ...");

    }
}
