package pers.wmx.adapter;

import java.util.Map;

/**
 * 用适配器包装
 *
 * @author: wangmingxin1
 * @create: 2018-11-07 16:24
 **/
public class OuterUserInfo extends OuterUserImpl implements UserInfo{

    private Map baseInfo = super.getUserBaseInfo();
    private Map jobInfo = super.getUserJobInfo();
    private Map homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        String userName = (String) baseInfo.get("userName");
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        return mobileNumber;
    }

    @Override
    public String getLevel() {
        String level = (String) jobInfo.get("level");
        return level;
    }
}
