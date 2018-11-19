package pers.wmx.decorator;

/**
 * 茅草房
 *
 * @author: wangmingxin1
 * @create: 2018-11-19 11:58
 **/
public class ThatchHouse extends House{

    //最开始家穷住在茅草屋里，无奈刮风漏雨，难受的一批

    @Override
    public void live() {
        System.out.println("住在房子里...");
    }
}
