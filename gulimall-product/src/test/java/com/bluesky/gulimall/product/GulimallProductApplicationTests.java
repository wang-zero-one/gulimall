package com.bluesky.gulimall.product;

import com.bluesky.gulimall.product.entity.BrandEntity;
import com.bluesky.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("范德萨");
        brandEntity.setName("小敏");
        brandService.save(brandEntity);
    }

}
