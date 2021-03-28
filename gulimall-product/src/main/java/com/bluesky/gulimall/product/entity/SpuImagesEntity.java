package com.bluesky.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:18:03
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ͼƬ??
	 */
	private String imgName;
	/**
	 * ͼƬ??ַ
	 */
	private String imgUrl;
	/**
	 * ˳?
	 */
	private Integer imgSort;
	/**
	 * ?Ƿ?Ĭ??ͼ
	 */
	private Integer defaultImg;

}
