package com.bluesky.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku????????&ֵ
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:18:03
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

