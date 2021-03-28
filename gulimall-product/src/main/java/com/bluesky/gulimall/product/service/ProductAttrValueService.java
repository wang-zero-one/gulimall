package com.bluesky.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu????ֵ
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:18:03
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

