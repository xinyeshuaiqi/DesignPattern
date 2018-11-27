package pers.wmx.chainresponsibility;

/**
 * 用学生请假来模拟责任链模式
 *    假设：
 *    学生只请几天假，给班主任说就行
 *    学生请1周及以上，需要给班主任说，班主任没权力决定，需要上报年级辅导员
 *    学生请1个学期假，需要给班主任说，班主任没权力决定，需要上报年级辅导员，年级辅导员辅导员也没有权力，上报院长
 *
 *    学生发起一个请假的请求
 *    班主任处理  ---班主任权利不够---> 年级辅导员处理  ------年级辅导员权力不够------>  院长处理
 *
 *    形成了一个链
 *
 *    这就是责任链模式
 *
 *
 * @author: wangmingxin1
 * @create: 2018-11-27 12:50
 **/
public class Student {

    private int type = 0;   //表示请假的类型： 1表示只请假几天，2表示请假一周及以上，3表示

    private String name = "";

    private String request = "";

    public Student(int type,String name, String request) {
        this.type = type;
        this.request =name + request;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getRequest() {
        return request;
    }
}
