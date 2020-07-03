package com.halfsummer.business.service;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.vo.VideoVo;

/**
 * @author BestClever
 * @title: VideoSevice
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:47
 */
public interface VideoSevice {

    DataGridResultInfo listVideo(VideoVo videoVo);

    ResultInfo save(VideoVo videoVo);

    ResultInfo update(VideoVo videoVo);

    ResultInfo delete(VideoVo videoVo);

    ResultInfo findByVideoId(VideoVo videoVo);
}
