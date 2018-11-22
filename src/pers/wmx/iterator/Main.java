package pers.wmx.iterator;

/**
 * @author: wangmingxin1
 * @create: 2018-11-22 14:33
 **/
public class Main {
    public static void main(String[] args){

        IUser user = new User();

        //模拟10个用户
        for (int i = 0; i < 10 ; i++) {
            user.add(i,"用户"+i);
        }

        //获取user 内部用户列表的迭代器
        IUserIterator iterator = user.iterator();

        while(iterator.hasNext()){
            IUser next = (IUser) iterator.next();
            System.out.println(next.getUserInfo());
        }

    }
}
