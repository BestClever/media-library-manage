package com.halfsummer.business.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.halfsummer.baseframework.enums.CommonEnum;
import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.PageWrapper;
import com.halfsummer.baseframework.result.ResultDataUtil;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.domain.Video;
import com.halfsummer.business.domain.VideoExample;
import com.halfsummer.business.mapper.VideoMapper;
import com.halfsummer.business.service.VideoSevice;
import com.halfsummer.business.vo.VideoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BestClever
 * @title: VideoSeviceImpl
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:47
 */
@Service
public class VideoSeviceImpl implements VideoSevice {

    @Autowired
    private VideoMapper videoMapper;
    
    /**
     * 查询 列表
     * @param videoVo
     * @return
     */
    public DataGridResultInfo listVideo(VideoVo videoVo){
        PageWrapper pageWrapper = new PageWrapper();
        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria = videoExample.createCriteria();
        if(!ObjectUtil.isEmpty(videoVo)){
            if(StrUtil.isNotEmpty(videoVo.getVideoId())){
                criteria.andVideoIdEqualTo(videoVo.getVideoId());
            }
            if(StrUtil.isNotEmpty(videoVo.getVideoTitle())){
                criteria.andVideoTitleLike("%"+videoVo.getVideoTitle()+"%");
            }
        }
        PageHelper.startPage(videoVo.getPage(),videoVo.getLimit());
        List<Video> videoList = videoMapper.selectByExample(videoExample);
        PageInfo<Video> videoPageInfo = new PageInfo<>(videoList);
        pageWrapper.setList(videoPageInfo.getList());
        pageWrapper.setTotal(videoPageInfo.getTotal());
        return ResultDataUtil.createQueryResult(pageWrapper);
    }

    /**
     * 新增
     * @param videoVo
     * @return
     */
    public ResultInfo save(VideoVo videoVo){
        Video video = new Video();
        BeanUtils.copyProperties(videoVo,video);
        int b = videoMapper.insert(video);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_FAILURE);
        }
    }

    /**
     * 新增
     * @param videoVo
     * @return
     */
    public ResultInfo update(VideoVo videoVo){
        Video video = new Video();
        BeanUtils.copyProperties(videoVo,video);
        int b = videoMapper.updateByPrimaryKey(video);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_FAILURE);
        }
    }

    /**
     * 删除
     * @param videoVo
     * @return
     */
    public ResultInfo delete(VideoVo videoVo){
        int b = videoMapper.deleteByPrimaryKey(videoVo.getVideoId());
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_FAILURE);
        }
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param videoVo
     * @return
     */
    public ResultInfo findByVideoId(VideoVo videoVo){
        Video video = videoMapper.selectByPrimaryKey(videoVo.getVideoId());
        if (ObjectUtil.isEmpty(video)) {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_NOT_EXIST);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_EXIST);
        }
    }
}
