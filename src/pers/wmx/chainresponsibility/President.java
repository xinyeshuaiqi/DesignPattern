package pers.wmx.chainresponsibility;

/**
 * 院长
 *
 *
 * @author: wangmingxin1
 * @create: 2018-11-27 14:35
 **/
public class President extends Handler {

    public President() {
        super(3);  //院长的权力级别为3
    }

    @Override
    protected void response(Student student) {
        System.out.println(student.getRequest());
        System.out.println("院长同意了"+student.getName() + "请假 ...");
    }
}
