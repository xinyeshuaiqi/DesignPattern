package pers.wmx.facade;

/**
 * 顾客类
 *
 * @author: wangmingxin1
 * @create: 2018-11-06 15:58
 **/
public class Customer {
    public static void main(String[] args){
        JD jd = new JD();

        String address = "北京市昌平区建明里小区xxxxxx";
        String phone = "18850079747";

        jd.buySomething(address,phone);
    }

}
