package com.mosey.ddd.order.infrastructure.repository.dao;

import com.mosey.ddd.order.infrastructure.repository.dataobj.OrderDO;
import org.springframework.stereotype.Repository;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Repository
public class OrderDao {
    public OrderDO insertOne(OrderDO of) {
        // insert into db valuse xxx；
        of.setId(100001L);
        return of;
    }
}
