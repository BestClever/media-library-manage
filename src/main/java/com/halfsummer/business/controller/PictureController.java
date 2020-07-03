package com.halfsummer.business.controller;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.service.PictureService;
import com.halfsummer.business.vo.PictureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BestClever
 * @title: PictureController
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 10:54
 */
@Controller
@RequestMapping(value = "/picture")
public class PictureController {
    
    @Autowired
    private PictureService pictureService;
    
    @RequestMapping(value = "/index")
    public String index() {
        return "picture/index";
    }

    @RequestMapping(value = "/edit")
    public String edit() {
        return "picture/edit";
    }

    @RequestMapping(value = "/add")
    public String add() {
        return "picture/add";
    }


    /**
     * 查询
     * @param pictureVo
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public DataGridResultInfo list(PictureVo pictureVo){
        return pictureService.listPicture(pictureVo);
    }

    /**
     * 新增
     * @param pictureVo
     * @return
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public ResultInfo save(PictureVo pictureVo){
        return pictureService.save(pictureVo);
    }

    /**
     * 修改
     * @param pictureVo
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public ResultInfo update(PictureVo pictureVo){
        return pictureService.update(pictureVo);
    }

    /**
     * 删除
     * @param pictureVo
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public ResultInfo delete(PictureVo pictureVo){
        return pictureService.delete(pictureVo);
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param pictureVo
     * @return
     */
    @RequestMapping(value = "/findByPictureId")
    @ResponseBody
    public ResultInfo findByPictureId(PictureVo pictureVo){
        return pictureService.findByPictureId(pictureVo);
    }
}
