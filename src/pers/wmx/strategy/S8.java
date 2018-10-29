package pers.wmx.strategy;

/**
 * S8系列赛
 *
 * @author: wangmingxin1
 * @create: 2018-10-29 15:54
 **/
public class S8 {
    private LPL lpl;
    public S8(LPL lpl){
        this.lpl=lpl;
    }

    //队伍上场
    public void comeOnStage(){
        this.lpl.comeOnStage();
    }

}
