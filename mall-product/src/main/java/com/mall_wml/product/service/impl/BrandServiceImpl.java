package com.mall_wml.product.service.impl;

import com.mall_wml.product.domain.po.Brand;
import com.mall_wml.product.mapper.BrandMapper;
import com.mall_wml.product.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品品牌表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
