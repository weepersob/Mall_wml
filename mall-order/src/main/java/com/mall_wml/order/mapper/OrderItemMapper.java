package com.mall_wml.order.mapper;

import com.mall_wml.order.domain.po.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单明细表 Mapper 接口
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {

}
