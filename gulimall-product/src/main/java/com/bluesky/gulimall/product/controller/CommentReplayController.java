package com.bluesky.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluesky.gulimall.product.entity.CommentReplayEntity;
import com.bluesky.gulimall.product.service.CommentReplayService;
import com.bluesky.common.utils.PageUtils;
import com.bluesky.common.utils.R;



/**
 * ??Ʒ???ۻظ???ϵ
 *
 * @author wgf
 * @email blueskyatoo@gmail.com
 * @date 2021-03-28 16:54:09
 */
@RestController
@RequestMapping("product/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CommentReplayEntity commentReplay = commentReplayService.getById(id);

        return R.ok().put("commentReplay", commentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.save(commentReplay);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.updateById(commentReplay);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
