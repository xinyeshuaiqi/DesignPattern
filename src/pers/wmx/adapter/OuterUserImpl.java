package pers.wmx.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangmingxin1
 * @create: 2018-11-07 16:11
 **/
public class OuterUserImpl implements OuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String,String> baseInfo = new HashMap();

        baseInfo.put("userName", "外部员工姓名：xxx");
        baseInfo.put("mobileNumber", "外部员工手机：xxx");

        return baseInfo;
    }

    @Override
    public Map getUserJobInfo() {
        Map<String,String> jobInfo = new HashMap();

        jobInfo.put("level", "外部员工级别：xxx");

        return jobInfo;
    }

    @Override
    public Map getUserHomeInfo() {

        Map<String,String> homeInfo = new HashMap();

        homeInfo.put("homeAddress", "外部员工住址：xxx");

        return homeInfo;
    }
}
