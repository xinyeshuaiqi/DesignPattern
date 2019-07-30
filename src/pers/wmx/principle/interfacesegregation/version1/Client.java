package pers.wmx.principle.interfacesegregation.version1;

/**
 * @author: wang ming xin
 * @create: 2019-07-30 23:59
 */
public class Client {
    public static void main(String[] args){

      PettyGirl baojie = new PettyGirl("宝姐");

      Searcher searcher = new Searcher(baojie);
      searcher.show();

    }
}
