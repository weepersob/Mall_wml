package com.mall_wml.order.service.impl;

import com.mall_wml.order.domain.po.PaymentRecord;
import com.mall_wml.order.mapper.PaymentRecordMapper;
import com.mall_wml.order.service.IPaymentRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付记录表 服务实现类
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Service
public class PaymentRecordServiceImpl extends ServiceImpl<PaymentRecordMapper, PaymentRecord> implements IPaymentRecordService {

}
