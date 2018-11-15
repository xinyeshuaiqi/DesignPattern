package pers.wmx.bridge;

/**
 * @author: wangmingxin1
 * @create: 2018-11-15 18:28
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
