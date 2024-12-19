package com.mall_wml.user.service.impl;

import com.mall_wml.user.domain.po.Cart;
import com.mall_wml.user.mapper.CartMapper;
import com.mall_wml.user.service.ICartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-19
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
