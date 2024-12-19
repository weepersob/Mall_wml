package com.mall_wml.order.mapper;

import com.mall_wml.order.domain.po.PaymentRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 支付记录表 Mapper 接口
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Mapper
public interface PaymentRecordMapper extends BaseMapper<PaymentRecord> {

}
