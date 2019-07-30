package pers.wmx.principle.interfacesegregation.version2;



/**
 * @author: wang ming xin
 * @create: 2019-07-31 00:12
 */
public class Client {
    public static void main(String[] args){
        PettyGirl baojie = new PettyGirl("宝姐");

        GoodBodyGirlSearcher searcher =new GoodBodyGirlSearcher(baojie);
        searcher.show();

        GreatTemperamentSearcher searcher1 = new GreatTemperamentSearcher(baojie);
        searcher1.show();

    }
}
