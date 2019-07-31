package pers.wmx.principle.dependenceinversion.version1;

/**
 * @author: wang ming xin
 * @create: 2019-07-31 22:07
 */
public class Main {
    public static void main(String[] args){
        Person zhangsan = new Person();
        zhangsan.recieveMsg(new Email());
    }
}


class Email{
    public String getInfo(){
        return "nmsl";
    }
}

class Person{

    //recieveMsg直接依赖了一个类！！！ 显然不行
    //代码耦合度太强  如果更改获取的消息（微信、短信），还需要新增类，以及需要新加接收消息的重载方法
    //引入一个抽象的接口  IReceiver  依赖抽象 体现接口编程 这样设计的代码更灵活
    public void recieveMsg(Email email){
        System.out.println(email.getInfo());
    }
}
