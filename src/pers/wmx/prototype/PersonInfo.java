package pers.wmx.prototype;

/**
 * 用这个场景模拟原型模式 : 把个人信息拷贝多份投递给多个公司hr(可以对拷贝的个人信息做些修改)
 *
 * @author: wangmingxin1
 * @create: 2018-11-29 17:06
 **/
public class PersonInfo implements Cloneable{
    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;

    public PersonInfo(String name){
        this.name = name;
    }

    /**
     * @param birthday 生日
     * @param sex 性别
     * @param school 毕业学校
     * @return void
     */
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * @param timeArea 工作年限
     * @param company 所在公司
     * @return void
     */
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public Object clone(){
        PersonInfo personInfo = null;
        try {
            personInfo = (PersonInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return personInfo;
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

}
