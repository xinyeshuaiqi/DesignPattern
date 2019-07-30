package pers.wmx.principle.interfacesegregation.version1;

/**
 * @author: wang ming xin
 * @create: 2019-07-30 23:56
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
