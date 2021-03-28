package com.bluesky.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:18:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

