package com.mall_wml.order.service.impl;

import com.mall_wml.order.domain.po.OrderItem;
import com.mall_wml.order.mapper.OrderItemMapper;
import com.mall_wml.order.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
