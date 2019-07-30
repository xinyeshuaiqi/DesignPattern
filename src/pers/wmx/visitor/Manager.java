package pers.wmx.visitor;

/**
 * @author: wangmingxin1
 * @create: 2018-11-28 10:30
 **/
public class Manager extends Employee{
    //经理关注他的业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
