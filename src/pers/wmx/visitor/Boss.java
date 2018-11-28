package pers.wmx.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板要查看他的经理和普通员工
 *
 * @author: wangmingxin1
 * @create: 2018-11-28 10:38
 **/
public class Boss {
    public static void main(String[] args){
        IVisitor visitor = new Visitor();

        //模拟出来几个员工
        List<Employee> employees = new ArrayList<>();

        CommonEmployee ZhaoLiu = new CommonEmployee();
        ZhaoLiu.setName("赵六");
        ZhaoLiu.setSex(Employee.MALE);
        ZhaoLiu.setSalary(8000);
        ZhaoLiu.setJob("忽悠客户买公司产品");

        CommonEmployee WangErMazi = new CommonEmployee();
        WangErMazi.setName("王二麻子");
        WangErMazi.setSex(Employee.FEMALE);
        WangErMazi.setSalary(20000);
        WangErMazi.setJob("架构师");

        Manager ZhaoErQueZi = new Manager();
        ZhaoErQueZi.setName("赵二瘸子");
        ZhaoErQueZi.setSex(Employee.MALE);
        ZhaoErQueZi.setSalary(30000);
        ZhaoErQueZi.setPerformance("带领团队克服了xxx困难，完成了xxx艰巨的任务");

        employees.add(ZhaoLiu);
        employees.add(WangErMazi);
        employees.add(ZhaoErQueZi);

        for(Employee employee : employees){
            employee.accept(visitor);
        }

    }

}
