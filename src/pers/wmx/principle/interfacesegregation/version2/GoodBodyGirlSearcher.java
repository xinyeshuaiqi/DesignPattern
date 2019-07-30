package pers.wmx.principle.interfacesegregation.version2;

/**
 * @author: wang ming xin
 * @create: 2019-07-31 00:02
 */
//找长的好看身材好的
public class GoodBodyGirlSearcher extends  AbstractSearcher {
    public GoodBodyGirlSearcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        super.goodBodyGirl.goodLooking();
        super.goodBodyGirl.niceFigure();
    }
}
