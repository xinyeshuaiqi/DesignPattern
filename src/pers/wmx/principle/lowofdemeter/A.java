package pers.wmx.principle.lowofdemeter;

/**
 * @author: wang ming xin
 * @create: 2019-08-06 23:38
 */
public class A {
}


class B{
    A a;  //A是B的直接朋友

    public void doSomething(A a){  //A是B的直接朋友
        //....
    }

    public A getA(){

        //....
        A a = new A();
        //....

        return a;  //A是B的直接朋友

    }

}

class C{
    public void doSomething(){
        //....
        A a = new A(); //A不是C的直接朋友，但是C直接在方法中使用，违反了【迪米特法则】
                       //即陌生的类不要以局部变量的形式出现在类的内部
    }
}