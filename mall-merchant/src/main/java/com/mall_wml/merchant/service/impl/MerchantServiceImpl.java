package com.mall_wml.merchant.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.mall_common.util.Result;
import com.mall_wml.merchant.constants.MerchantMessageConstants;
import com.mall_wml.merchant.domain.dto.MerchantDto;
import com.mall_wml.merchant.domain.po.Merchant;
import com.mall_wml.merchant.mapper.MerchantMapper;
import com.mall_wml.merchant.service.IMerchantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商家表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements IMerchantService {

    /**
     * 根据ID获取商家信息
     *
     * @param id 商家ID
     * @return Result
     */
    @Override
    public Result getMerchant(Long id) {
        Merchant merchantInfo = getById(id);
        if(ObjectUtil.isNull(merchantInfo)){
            return Result.error(MerchantMessageConstants.MERCHANT_NOT_FOUND);
        }
        MerchantDto merchantDto = BeanUtil.copyProperties(merchantInfo, MerchantDto.class);
        return Result.success(merchantDto);
    }
}
