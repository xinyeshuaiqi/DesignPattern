package pers.wmx.builder;

import java.util.ArrayList;

/**
 * @author: wangmingxin1
 * @create: 2018-11-14 17:09
 **/
public class BMWBuilder extends CarBuilder {

    BMWCarModel bmw = new BMWCarModel();

    @Override
    public void setActionSequence(ArrayList<String> sequence) {
        this.bmw.setActionSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
