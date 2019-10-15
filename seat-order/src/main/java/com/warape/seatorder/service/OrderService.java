package com.warape.seatorder.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.warape.seatorder.entity.Order;

/**
 * @author IT云清
 */
public interface OrderService extends IService<Order> {

    /**
     * 创建订单
     * @param order1
     * @return
     */
    void create(Order order1);
}
