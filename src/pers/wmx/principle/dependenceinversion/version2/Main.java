package pers.wmx.principle.dependenceinversion.version2;

/**
 * @author: wang ming xin
 * @create: 2019-07-31 22:07
 */
public class Main {
    public static void main(String[] args){
        Person lisi = new Person();

        IReceiver receiver = new Email();
        lisi.recieveMsg(receiver);

        receiver = new WeChat();
        lisi.recieveMsg(receiver);
    }
}

//定义一个接口  面向接口编程
interface  IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮箱:nmsl";
    }
}

class WeChat implements IReceiver{
    public String getInfo(){
        return "微信:mmp";
    }
}

class Person{
    public void recieveMsg(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
