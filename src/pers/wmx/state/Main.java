package pers.wmx.state;

/**
 * @author: wangmingxin1
 * @create: 2018-11-29 11:11
 **/
public class Main {
    public static void main(String[] args){
        Context context = new Context();

        context.setState(Context.playStete);
        context.play();
        System.out.println(context.getState());
        context.sleep();  //状态在封装的方法里被修改
        System.out.println(context.getState());
    }
}
