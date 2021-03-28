package com.bluesky.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ????&???Է???????
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:18:03
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

