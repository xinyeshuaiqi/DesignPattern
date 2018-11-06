package pers.wmx.facade;

public interface OrderHandle {
    public void updateOrder();    //修改订单状态  已支付
    public void fillSendInfo(String address,String phone);   //填写收件人地址、电话
    public void sendGoods();      //发货
}
