package com.mosey.ddd.order.infrastructure.repository.dataobj;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Data
//@Table("tb_order")
public class OrderDO implements Serializable {
    private static final long serialVersionUID = -8461822599950037465L;
//    @Id
//    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    //todo mapstruct
    public static OrderDO of(OrderEntity entity){
        OrderDO orderDO = new OrderDO();
        //set(entity.getxxx)
        return orderDO;
    }

    public OrderEntity toEntity(){
        OrderEntity orderEntity = new OrderEntity(id);
        return orderEntity;
    }
}
