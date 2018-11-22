package pers.wmx.iterator;

/**
 * 用户信息
 *
 * @author: wangmingxin1
 * @create: 2018-11-22 14:07
 **/
public interface IUser {
    public String getUserInfo();

    public void add(Integer userId,String username);

    public IUserIterator iterator();
}
