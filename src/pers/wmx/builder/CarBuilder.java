package pers.wmx.builder;

import java.util.ArrayList;

/**
 * @author: wangmingxin1
 * @create: 2018-11-14 17:08
 **/
public abstract class CarBuilder {

    //设置执行顺序
    public abstract void setActionSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
