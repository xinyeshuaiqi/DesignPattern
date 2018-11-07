package pers.wmx.adapter;

/**
 * @author: wangmingxin1
 * @create: 2018-11-07 16:38
 **/
public class Main {

    public static void main(String[] args){
        //获取内部员工手机号
        UserInfo userInfo = new UserInfoImpl();
        String mobileNumber = userInfo.getMobileNumber();
        System.out.println(mobileNumber);

        //获取外部员工手机号
        userInfo = new OuterUserInfo();
        mobileNumber=userInfo.getMobileNumber();
        System.out.println(mobileNumber);

    }
}
