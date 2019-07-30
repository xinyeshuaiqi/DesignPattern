package pers.wmx.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangmingxin1
 * @create: 2018-11-22 14:13
 **/
public class User implements IUser {

    private Integer userId;
    private String username;

    private List<User> userList = new ArrayList<>();

    public User() {
    }

    public User(Integer userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    @Override
    public String getUserInfo() {
        String info = "";

        info += "用户id:" + this.userId;
        info += ", 用户名:" + this.username;

        return info;
    }

    @Override
    public void add(Integer userId, String username) {
        userList.add(new User(userId, username));
    }

    @Override
    public IUserIterator iterator() {
        return new UserIterator(this.userList);
    }
}
