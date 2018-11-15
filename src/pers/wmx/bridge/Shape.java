package pers.wmx.bridge;

/**
 * @author: wangmingxin1
 * @create: 2018-11-15 18:28
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
