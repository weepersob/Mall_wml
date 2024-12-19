package com.mall_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "商家信息")
public class MerchantDto {
    /**
     * 商家ID
     */
    @Schema(description = "商家ID")
    private Long id;

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    private String username;

    /**
     * 店铺名称
     */
    @Schema(description = "店铺名称")
    private String shopName;

    /**
     * 店铺logo
     */
    @Schema(description = "店铺logo链接")
    private String shopLogo;
    /**
     * 联系人姓名
     */
    @Schema(description = "联系人姓名")
    private String contactName;
    /**
     * 联系电话
     */
    @Schema(description = "联系电话")
    private String contactPhone;
    /**
     * 邮箱
     */
    @Schema(description = "联系邮箱")
    private String email;
    /**
     * 商家地址
     */
    @Schema(description = "商家地址")
    private String address;

    /**
     * 店铺描述
     */
    @Schema(description = "店铺描述")
    private String description;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    private LocalDateTime createdTime;

    /**
     * 商家头像
     */
    @Schema(description = "商家头像")
    private String avatar;
}
