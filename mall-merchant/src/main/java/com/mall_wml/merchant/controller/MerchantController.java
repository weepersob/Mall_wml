package com.mall_wml.merchant.controller;


import com.mall_common.util.Result;
import com.mall_wml.merchant.service.IMerchantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商家表 前端控制器
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@RestController
@RequestMapping("/merchant")
@RequiredArgsConstructor
@Tag(name = "商家服务", description = "商家服务")
public class MerchantController {

    private final IMerchantService merchantService;
    /**
     * 根据ID获取商家信息
     *
     * @param id ID
     * @return Result
     */
    @Operation(summary = "根据ID获取商家信息", description = "根据ID获取商家信息")
    @GetMapping("/{id}")
    public Result getMerchant(@PathVariable Long id) {
        return merchantService.getMerchant(id);
    }

}
