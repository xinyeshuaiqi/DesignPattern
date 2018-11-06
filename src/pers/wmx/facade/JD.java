package pers.wmx.facade;

/**
 * 京东
 *
 * @author: wangmingxin1
 * @create: 2018-11-06 16:10
 **/
public class JD {

    public void buySomething(String address, String phone){
        OrderHandle orderHandle = new OrderHandleImpl();

        //按照一定得顺序封装
        orderHandle.updateOrder();
        orderHandle.fillSendInfo(address,phone);
        orderHandle.sendGoods();

    }
}
