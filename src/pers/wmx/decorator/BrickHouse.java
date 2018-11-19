package pers.wmx.decorator;

/**
 * 瓦房
 *
 * @author: wangmingxin1
 * @create: 2018-11-19 12:50
 **/
public class BrickHouse extends House  {

    //生活所需、国家政策补贴，修修补补终于重新装修了波房子---->瓦房

    private House house;

    public BrickHouse(House house){
        this.house = house;
    }

    public void decorateHouse(){
        System.out.println("修建瓦房...");
    }

    @Override
    public void live() {
        this.decorateHouse();
        house.live();
    }
}
