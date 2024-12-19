package com.mall_wml.product.mapper;

import com.mall_wml.product.domain.po.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品分类表 Mapper 接口
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
