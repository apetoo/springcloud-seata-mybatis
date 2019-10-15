package com.warape.seatorder.controller;

import com.warape.seatorder.entity.Order;
import com.warape.seatorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT云清
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;

    /**
     * 创建订单
     * @param order1
     * @return
     */
    @GetMapping("create")
    public String create(Order order1){
        orderServiceImpl.create(order1);
        return "Create order1 success";
    }
}
