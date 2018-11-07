package pers.wmx.adapter;

import java.util.Map;

//外部系统的用户接口
public interface OuterUser {
    //基本信息
    public Map getUserBaseInfo();
    //工作信息
    public Map getUserJobInfo();
    //家庭信息
    public Map getUserHomeInfo();
}
