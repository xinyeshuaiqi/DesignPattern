package pers.wmx.prototype;

/**
 * @author: wangmingxin1
 * @create: 2018-11-29 17:10
 **/
public class Main {
    public static void main(String[] args){

        //给hr1的个人简历
        PersonInfo personInfo = new PersonInfo("张三");

        personInfo.setPersonInfo("1990年1月2日","男","清华大学");
        personInfo.setWorkExperience("工作5年","微软");
        personInfo.display();

        System.out.println("***************************************");

        //这里当然可以直接set修改,为了模拟原型模式 我们使用clone模式
        //给hr2的个人简历
        PersonInfo clone1 = (PersonInfo)personInfo.clone();
        clone1.setWorkExperience("工作10年","IBM");
        clone1.display();


    }
}
