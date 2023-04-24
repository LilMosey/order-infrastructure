package com.mosey.ddd.order.infrastructure.repository.impl;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;
import com.mosey.ddd.order.domain.sdk.repository.OrderRepository;
import com.mosey.ddd.order.infrastructure.repository.dao.OrderDao;
import com.mosey.ddd.order.infrastructure.repository.dataobj.OrderDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private OrderDao orderDao;

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        OrderDO orderDO = orderDao.insertOne(OrderDO.of(orderEntity));

        return orderDO.toEntity();
    }
}
