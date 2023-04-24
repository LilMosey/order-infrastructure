package com.mosey.ddd.order.infrastructure.mqImpl.rockectmq;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;
import org.springframework.stereotype.Service;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Service
public class OrderRocketMQ {
    public void sendOrderCreateSuccessMQ(OrderEntity order) {
        System.out.println("订单创建成功，发送mq消息成功，订单id为" + order.getId());
    }
}
