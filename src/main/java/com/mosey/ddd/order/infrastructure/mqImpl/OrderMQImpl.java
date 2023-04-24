package com.mosey.ddd.order.infrastructure.mqImpl;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;
import com.mosey.ddd.order.domain.sdk.mq.OrderMQ;
import com.mosey.ddd.order.infrastructure.mqImpl.rockectmq.OrderRocketMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Service
public class OrderMQImpl implements OrderMQ {

    @Autowired
    private OrderRocketMQ orderRocketMQ;

    @Override
    public void sendOrderCreateSuccessMQ(OrderEntity order) {
        orderRocketMQ.sendOrderCreateSuccessMQ(order);
    }
}
