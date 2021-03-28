package com.bluesky.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 17:29:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

