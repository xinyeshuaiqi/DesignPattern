package pers.wmx.adapter;

/**
 * @author: wangmingxin1
 * @create: 2018-11-07 15:56
 **/
public class UserInfoImpl implements UserInfo {

    //仅仅模拟这个操作  实际上是需要从数据库获取这些信息

    @Override
    public String getUserName() {
        return "内部员工姓名：xxx";
    }

    @Override
    public String getHomeAddress() {
        return "内部员工住址：xxx";
    }

    @Override
    public String getMobileNumber() {
        return "内部员工手机：xxx";
    }

    @Override
    public String getLevel() {
        return "内部员工级别：xxx";
    }
}
