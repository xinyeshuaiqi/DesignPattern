package pers.wmx.chainresponsibility;

/**
 * 班主任
 *
 * @author: wangmingxin1
 * @create: 2018-11-27 14:21
 **/
public class ClassTeacher extends Handler{

    public ClassTeacher() {
        super(1);  //班主任的权力级别为1
    }

    @Override
    protected void response(Student student) {
        System.out.println(student.getRequest());
        System.out.println("班主任同意了"+student.getName() + "请假 ...");
    }


}
