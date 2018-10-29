package pers.wmx.strategy;

/**
 * 比赛开始
 *
 * @author: wangmingxin1
 * @create: 2018-10-29 16:00
 **/
public class ContestMain {
    public static void main(String[] args){
        S8 s ;

        //RNG上场
        s=new S8(new RNG());
        s.comeOnStage();
        System.out.println("虚空冠军队输了，呜呜呜");

        //EDG上场
        s=new S8(new EDG());
        s.comeOnStage();
        System.out.println("EDG也输了，厂长连上场的机会也没有");

        //IG上场
        s=new S8(new IG());
        s.comeOnStage();
        System.out.println("恭喜IG进入决赛，知道谁是老大哥了吗？");

    }
}
