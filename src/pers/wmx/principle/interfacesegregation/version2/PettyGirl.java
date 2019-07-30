package pers.wmx.principle.interfacesegregation.version2;

import pers.wmx.principle.interfacesegregation.version1.IPettyGirl;

/**
 * @author: wang ming xin
 * @create: 2019-07-30 23:51
 */
public class PettyGirl implements IGoodBodyGirl,IGreatTemperamentGirl {

    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name+"长得真好看");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name+"身材好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name+"女神气质");
    }
}
