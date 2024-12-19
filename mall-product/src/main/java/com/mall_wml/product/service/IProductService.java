package com.mall_wml.product.service;

import com.mall_common.util.Result;
import com.mall_wml.product.domain.dto.ProductDTO;
import com.mall_wml.product.domain.po.Product;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
public interface IProductService extends IService<Product> {

    /**
     * 新增商品
     *
     * @param productDTO 商品信息
     * @return Result
     */
    Result addProduct(ProductDTO productDTO);
}
