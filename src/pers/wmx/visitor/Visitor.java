package pers.wmx.visitor;

/**
 * @author: wangmingxin1
 * @create: 2018-11-28 10:37
 **/
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getBasicInfo(commonEmployee) + ",工作:" +commonEmployee.getJob());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getBasicInfo(manager) + ",业绩:" +manager.getPerformance());
    }

    private String getBasicInfo(Employee employee){
        return "姓名:" + employee.getName() + ",性别:" + (employee.getSex() == Employee.MALE ? "男," : "女,"  )
                +"薪水:"+employee.getSalary();
    }


}
