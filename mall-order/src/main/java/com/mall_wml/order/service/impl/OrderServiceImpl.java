package com.mall_wml.order.service.impl;

import com.mall_wml.order.domain.po.Order;
import com.mall_wml.order.mapper.OrderMapper;
import com.mall_wml.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
