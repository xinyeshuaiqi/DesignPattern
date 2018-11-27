package pers.wmx.chainresponsibility;

/**
 * 年级辅导员
 *
 * @author: wangmingxin1
 * @create: 2018-11-27 14:32
 **/
public class GradeInstructor extends Handler{
    public GradeInstructor() {
        super(2);  //年级辅导员的权力级别为2
    }

    @Override
    protected void response(Student student) {
        System.out.println(student.getRequest());
        System.out.println("年级辅导员同意了"+student.getName() + "请假 ...");
    }

}
