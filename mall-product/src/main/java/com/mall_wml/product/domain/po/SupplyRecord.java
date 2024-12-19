package com.mall_wml.product.domain.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 供应记录表
 * </p>
 *
 * @author mqw
 * @since 2024-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("supply_record")
public class SupplyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 供应记录ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商家ID
     */
    private Long merchantId;

    /**
     * 供应价格
     */
    private BigDecimal supplyPrice;

    /**
     * 供应数量
     */
    private Integer supplyQuantity;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 供应时间
     */
    private LocalDateTime supplyTime;

    /**
     * 状态：0-待收货，1-已收货
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;


}
