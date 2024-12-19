package com.mall_wml.product.controller;


import com.mall_common.util.Result;
import com.mall_wml.product.domain.dto.ProductDTO;
import com.mall_wml.product.service.IProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@RestController
@RequestMapping("/product")
@Tag(name = "商品服务", description = "商品服务")
@RequiredArgsConstructor
public class ProductController {

    private IProductService productService;

    /**
     * 新增商品
     *
     * @return Result
     */
    @PostMapping
    public Result addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }


}
