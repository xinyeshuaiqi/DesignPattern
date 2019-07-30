package pers.wmx.principle.interfacesegregation.version1;

/**
 * @author: wang ming xin
 * @create: 2019-07-30 23:53
 */
public abstract class AbstractSearcher {

    IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
