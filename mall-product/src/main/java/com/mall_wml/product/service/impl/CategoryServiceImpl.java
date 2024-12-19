package com.mall_wml.product.service.impl;

import com.mall_wml.product.domain.po.Category;
import com.mall_wml.product.mapper.CategoryMapper;
import com.mall_wml.product.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
