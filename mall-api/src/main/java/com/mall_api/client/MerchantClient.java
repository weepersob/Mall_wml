package com.mall_api.client;


import com.mall_api.config.DefaultFeignConfig;
import com.mall_api.dto.MerchantDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "mall-merchant", configuration = DefaultFeignConfig.class)
public interface MerchantClient {

    @GetMapping("/merchant/{id}")
    MerchantDto getMerchant(@PathVariable String id);

}
