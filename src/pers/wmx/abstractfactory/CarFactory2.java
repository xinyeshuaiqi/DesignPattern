package pers.wmx.abstractfactory;

/**生产跑车
 *
 * @author: wangmingxin1
 * @create: 2018-11-05 15:57
 **/
public class CarFactory2 extends AbstractCarFactory {
    @Override
    public Car createBmWCar() {
        return super.createCar(CarEnum.BMW2);
    }

    @Override
    public Car createMercedesCar() {
        return super.createCar(CarEnum.Mercedes2);
    }
}
