package com.halfsummer.business.controller;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.service.VideoSevice;
import com.halfsummer.business.vo.VideoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BestClever
 * @title: VideoController
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 10:54
 */
@Controller
@RequestMapping(value = "/video")
public class VideoController {
    
    @Autowired
    private VideoSevice videoSevice;
    
    @RequestMapping(value = "/index")
    public String index() {
        return "video/index";
    }

    @RequestMapping(value = "/edit")
    public String edit() {
        return "video/edit";
    }

    @RequestMapping(value = "/add")
    public String add() {
        return "video/add";
    }

    /**
     * 查询
     * @param videoVo
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public DataGridResultInfo list(VideoVo videoVo){
        return videoSevice.listVideo(videoVo);
    }

    /**
     * 新增
     * @param videoVo
     * @return
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public ResultInfo save(VideoVo videoVo){
        return videoSevice.save(videoVo);
    }

    /**
     * 修改
     * @param videoVo
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public ResultInfo update(VideoVo videoVo){
        return videoSevice.update(videoVo);
    }

    /**
     * 删除
     * @param videoVo
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public ResultInfo delete(VideoVo videoVo){
        return videoSevice.delete(videoVo);
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param videoVo
     * @return
     */
    @RequestMapping(value = "/findByVideoId")
    @ResponseBody
    public ResultInfo findByVideoId(VideoVo videoVo){
        return videoSevice.findByVideoId(videoVo);
    }
}
