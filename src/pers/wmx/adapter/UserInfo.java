package pers.wmx.adapter;


//员工管理系统  获取员工信息的顶级接口
public interface UserInfo {

    //用户名
    public String getUserName();

    //家庭地址
    public String getHomeAddress();

    //手机号
    public String getMobileNumber();

    //职位级别
    public String getLevel();

}
