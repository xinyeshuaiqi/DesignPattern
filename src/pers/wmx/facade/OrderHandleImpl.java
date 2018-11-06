package pers.wmx.facade;

/**
 * @author: wangmingxin1
 * @create: 2018-11-06 16:08
 **/
public class OrderHandleImpl implements OrderHandle{
    @Override
    public void updateOrder() {
        System.out.println("订单状态：未支付->已支付");
    }

    @Override
    public void fillSendInfo(String address, String phone) {
        System.out.println("填写发货单  地址:"+address+",手机号:"+phone);
    }

    @Override
    public void sendGoods() {
        System.out.println("商家正在出货 ...");
    }
}
