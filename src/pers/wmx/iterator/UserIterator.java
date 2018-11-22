package pers.wmx.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangmingxin1
 * @create: 2018-11-22 14:23
 **/
public class UserIterator implements IUserIterator{

    private List<User> userList = new ArrayList<>();

    private int index = 0;

    public UserIterator(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public boolean hasNext() {

        if(this.index >= userList.size() || this.userList.get(index) == null){
            return false;
        }

        return true;
    }

    @Override
    public IUser next() {
        return (IUser)this.userList.get(this.index++);
    }
}
