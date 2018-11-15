package pers.wmx.bridge;

/**
 * @author: wangmingxin1
 * @create: 2018-11-15 18:29
 **/
public class Main {
    public static void main(String[] args){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
