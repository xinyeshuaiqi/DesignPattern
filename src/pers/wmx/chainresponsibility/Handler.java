package pers.wmx.chainresponsibility;

/**
 * @author: wangmingxin1
 * @create: 2018-11-27 14:15
 **/
public abstract class Handler {
    private int level =0;  //权力等级

    private Handler nextHanlder;  //责任链的下一位

    public Handler(int level) {
        this.level = level;
    }

    //处理学生的请求信息
    public final void HandleMessage(Student student){
        if(this.level == student.getType()){
            response(student);
        }else{
            System.out.println("我决定不了，上报给我的上一级决定...");
            if(this.nextHanlder !=null){
                this.nextHanlder.HandleMessage(student);
            }
        }
    }

    protected abstract void response(Student student);

    public void setNextHanlder(Handler nextHanlder) {
        this.nextHanlder = nextHanlder;
    }

    
}
