package pers.wmx.visitor;

/**
 * @author: wangmingxin1
 * @create: 2018-11-28 10:30
 **/
public class CommonEmployee extends Employee{

    //普通员工关注他的工作
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
