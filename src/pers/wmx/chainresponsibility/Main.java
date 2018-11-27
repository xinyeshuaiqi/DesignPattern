package pers.wmx.chainresponsibility;

/**
 * @author: wangmingxin1
 * @create: 2018-11-27 14:36
 **/
public class Main {
    public static void main(String[] args){
        Student zhangsan = new Student(3,"张三","请一个学期假，在家打英雄联盟");

        ClassTeacher classTeacher = new ClassTeacher();
        GradeInstructor gradeInstructor = new GradeInstructor();
        President president = new President();

        //形成一个链
        classTeacher.setNextHanlder(gradeInstructor);
        gradeInstructor.setNextHanlder(president);

        //学生只用把请求发给班主任，具体怎的流程不用关心
        classTeacher.HandleMessage(zhangsan);

    }
}
