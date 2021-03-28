package com.bluesky.gulimall.ware.dao;

import com.bluesky.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 17:33:09
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
