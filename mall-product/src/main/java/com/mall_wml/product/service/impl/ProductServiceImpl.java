package com.mall_wml.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.Db;
import com.mall_common.util.Result;
import com.mall_wml.product.domain.dto.ProductDTO;
import com.mall_wml.product.domain.po.Brand;
import com.mall_wml.product.domain.po.Category;
import com.mall_wml.product.domain.po.Product;
import com.mall_wml.product.domain.po.Supplier;
import com.mall_wml.product.mapper.ProductMapper;
import com.mall_wml.product.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {


    /**
     * 新增商品
     *
     * @param productDTO 商品DTO
     * @return Result
     */
    @Override
    public Result addProduct(ProductDTO productDTO) {
        // 检查分类是否存在
        if (productDTO.getCategoryId() == null || !Db.lambdaQuery(Category.class).eq(Category::getId, productDTO.getCategoryId()).exists()) {
            throw new IllegalArgumentException("指定的分类不存在");
        }

        // 检查品牌是否存在
        if (productDTO.getBrandId() == null || !Db.lambdaQuery(Brand.class).eq(Brand::getId, productDTO.getBrandId()).exists()) {
            throw new IllegalArgumentException("指定的品牌不存在");
        }

        // 检查供应商是否存在
        if (productDTO.getSupplierId() == null || !Db.lambdaQuery(Supplier.class).eq(Supplier::getId, productDTO.getSupplierId()).exists()) {
            throw new IllegalArgumentException("指定的供应商不存在");
        }

        // TODO 调用商家模块判断是否存在商家
        // 检查商家是否存在
//        if (productDTO.getMerchantId() == null || ) {
//            throw new IllegalArgumentException("指定的商家不存在");
//        }

        // 继续进行商品的新增操作...

        return Result.success();
    }


}
