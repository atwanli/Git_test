package com.mydomain;

/**
 * 交易处理接口
 */
public interface IOrderService {
    /**
     * 根据交易类型实现交易处理
     *
     * @param orderType 交易类型
     */
    void doHandle(String orderType);
}
