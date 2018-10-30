package pers.wmx.proxy;

/**
 * @author: wangmingxin1
 * @create: 2018-10-30 11:36
 **/
public class Agency implements House{

    House house;
    public Agency(House house){
        this.house=house;
    }

    @Override
    public void rentOut() {
        this.house.rentOut();
    }
}
