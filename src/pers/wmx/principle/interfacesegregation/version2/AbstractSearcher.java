package pers.wmx.principle.interfacesegregation.version2;

import pers.wmx.principle.interfacesegregation.version1.IPettyGirl;

/**
 * @author: wang ming xin
 * @create: 2019-07-30 23:53
 */
public abstract class AbstractSearcher {

    IGoodBodyGirl goodBodyGirl;

    IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    public abstract void show();
}
