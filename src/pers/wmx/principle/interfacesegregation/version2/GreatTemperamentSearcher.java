package pers.wmx.principle.interfacesegregation.version2;

/**
 * @author: wang ming xin
 * @create: 2019-07-31 00:13
 */
public class GreatTemperamentSearcher extends AbstractSearcher {

    public GreatTemperamentSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    @Override
    public void show() {
        super.greatTemperamentGirl.greatTemperament();
    }
}
