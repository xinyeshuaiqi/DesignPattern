package pers.wmx.abstractfactory;

/**
 * @author: wangmingxin1
 * @create: 2018-11-05 15:45
 **/
public abstract class AbstractCarFactory implements CarFactory{

    protected Car createCar(CarEnum carEnum){
        Car car = null;
        if (!carEnum.getValue().equals("")) {
            try {
                car = (Car)Class.forName(carEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return car;
    }
}
