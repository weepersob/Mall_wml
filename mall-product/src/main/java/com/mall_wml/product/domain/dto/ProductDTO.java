package com.mall_wml.product.domain.dto;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品新增DTO
 */
@Data
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品编码
     */
    private String code;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 商家ID
     */
    private Long merchantId;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 销售价
     */
    private BigDecimal salePrice;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 商品缩略图
     */
    private String thumbnail;

    /**
     * 商品介绍
     */
    private String description;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 状态：0-下架，1-上架
     */
    private Integer status;

}
