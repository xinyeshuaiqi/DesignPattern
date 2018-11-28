package pers.wmx.visitor;

/**
 * @author: wangmingxin1
 * @create: 2018-11-28 10:30
 **/
public interface IVisitor {

    // 访问普通员工
    public void visit(CommonEmployee commonEmployee);

    // 访问经理
    public void visit(Manager manager);
}
