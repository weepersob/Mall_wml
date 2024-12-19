package com.mall_wml.merchant.service;

import com.mall_common.util.Result;
import com.mall_wml.merchant.domain.po.Merchant;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商家表 服务类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
public interface IMerchantService extends IService<Merchant> {

    /**
     * <p>
     * 根据ID获取商家
     * </p>
     *
     * @param id   商家ID
     * @return     Result
     */
    Result getMerchant(Long id);
}
