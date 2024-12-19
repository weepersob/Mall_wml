package com.mall_wml.user.mapper;

import com.mall_wml.user.domain.po.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 购物车表 Mapper 接口
 * </p>
 *
 * @author mqw
 * @since 2024-12-19
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {

}
