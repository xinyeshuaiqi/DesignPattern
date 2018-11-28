package pers.wmx.visitor;

/**
 * @author: wangmingxin1
 * @create: 2018-11-28 10:31
 **/
public abstract class Employee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    private String name;

    private int salary;

    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //核心方法：  允许访问者访问
    public abstract void accept(IVisitor visitor);
}
