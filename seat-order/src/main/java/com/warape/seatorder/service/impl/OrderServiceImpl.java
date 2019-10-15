package com.warape.seatorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.warape.seatorder.entity.Order;
import com.warape.seatorder.feign.AccountApi;
import com.warape.seatorder.feign.StorageApi;
import com.warape.seatorder.mapper.OrderMapper;
import com.warape.seatorder.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author IT云清
 */
@Service("orderServiceImpl")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageApi storageApi;
    @Autowired
    private AccountApi accountApi;

    /**
     * 创建订单
     * @param order1
     * @return
     * 测试结果：
     * 1.添加本地事务：仅仅扣减库存
     * 2.不添加本地事务：创建订单，扣减库存
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order1) {
        LOGGER.info("------->交易开始");
        //本地方法
        orderMapper.insert(order1);

        //远程方法 扣减库存
        storageApi.decrease(order1.getProductId(), order1.getCount());

        //远程方法 扣减账户余额

        LOGGER.info("------->扣减账户开始order中");
        accountApi.decrease(order1.getUserId(), order1.getMoney());
        LOGGER.info("------->扣减账户结束order中");

        LOGGER.info("------->交易结束");
    }
}
