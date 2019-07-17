package com.mydomain;

public class PayService implements IOrderService {
    public void doHandle(String orderType) {
        System.out.println("pay 实现流程开发");
    }
}
