package com.mall_wml.order.mapper;

import com.mall_wml.order.domain.po.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
