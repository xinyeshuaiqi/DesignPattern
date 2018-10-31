package pers.wmx.factorymethod;

/**肯德基
 * 制作食物的工厂
 *
 * @author: wangmingxin1
 * @create: 2018-10-31 12:41
 **/
public class KFC {
    //c 是顾客指定要哪种类型的食物
    public static Food createFood(Class c) throws Exception {
        Food food = null;
        food= (Food) Class.forName(c.getName()).newInstance();

        return food;
    }
}
