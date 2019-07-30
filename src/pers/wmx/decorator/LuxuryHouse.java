package pers.wmx.decorator;

/**
 * 豪房
 *
 * @author: wangmingxin1
 * @create: 2018-11-19 12:57
 **/
public class LuxuryHouse extends House {
    //要娶媳妇了，房子得继续重新装修重建下

    private House house;

    public LuxuryHouse(House house){
        this.house = house;
    }

    public void decorateHouse(){
        System.out.println("修建豪房...");
    }

    @Override
    public void live() {
        this.decorateHouse();
        house.live();
    }

}
