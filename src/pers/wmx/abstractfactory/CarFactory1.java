package pers.wmx.abstractfactory;

/**生产轿车
 *
 * @author: wangmingxin1
 * @create: 2018-11-05 15:53
 **/
public class CarFactory1 extends AbstractCarFactory {
    @Override
    public Car createBmWCar() {
        return super.createCar(CarEnum.BMW1);
    }

    @Override
    public Car createMercedesCar() {
        return super.createCar(CarEnum.Mercedes1);
    }
}
