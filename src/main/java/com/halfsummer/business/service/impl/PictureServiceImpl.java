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
import com.halfsummer.baseframework.util.ResourcesUtil;
import com.halfsummer.business.domain.Book;
import com.halfsummer.business.domain.Picture;
import com.halfsummer.business.domain.PictureExample;
import com.halfsummer.business.mapper.PictureMapper;
import com.halfsummer.business.service.PictureService;
import com.halfsummer.business.vo.PictureVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BestClever
 * @title: PictureServiceImpl
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:47
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;
    /**
     * 查询 列表
     * @param pictureVo
     * @return
     */
    public DataGridResultInfo listPicture(PictureVo pictureVo){
        PageWrapper pageWrapper = new PageWrapper();
        PictureExample pictureExample = new PictureExample();
        PictureExample.Criteria criteria = pictureExample.createCriteria();
        if(!ObjectUtil.isEmpty(pictureVo)){
            if(StrUtil.isNotEmpty(pictureVo.getPictureId())){
                criteria.andPictureIdEqualTo(pictureVo.getPictureId());
            }
            if(StrUtil.isNotEmpty(pictureVo.getPictureTitle())){
                criteria.andPictureTitleLike("%"+pictureVo.getPictureTitle()+"%");
            }
        }
        PageHelper.startPage(pictureVo.getPage(),pictureVo.getLimit());
        List<Picture> pictureList = pictureMapper.selectByExample(pictureExample);
        PageInfo<Picture> picturePageInfoPageInfo = new PageInfo<>(pictureList);
        pageWrapper.setList(picturePageInfoPageInfo.getList());
        pageWrapper.setTotal(picturePageInfoPageInfo.getTotal());
        return ResultDataUtil.createQueryResult(pageWrapper);
    }

    /**
     * 新增
     * @param pictureVo
     * @return
     */
    public ResultInfo save(PictureVo pictureVo){
        //判断总数是否大于最大值
        int pictureCount = pictureMapper.countByExample(new PictureExample());
        int pictureMaxCount = Integer.valueOf(ResourcesUtil.getValue("resource.config", "pictureMaxCount"));
        if (pictureCount>pictureMaxCount) {
            return ResultDataUtil.createFail(CommonEnum.REPERTORY_FULL);
        }
        Picture picture = new Picture();
        BeanUtils.copyProperties(pictureVo,picture);
        int b = pictureMapper.insert(picture);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_FAILURE);
        }
    }

    /**
     * 新增
     * @param pictureVo
     * @return
     */
    public ResultInfo update(PictureVo pictureVo){
        Picture picture = new Picture();
        BeanUtils.copyProperties(pictureVo,picture);
        int b = pictureMapper.updateByPrimaryKey(picture);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_FAILURE);
        }
    }

    /**
     * 删除
     * @param pictureVo
     * @return
     */
    public ResultInfo delete(PictureVo pictureVo){
        int b = pictureMapper.deleteByPrimaryKey(pictureVo.getPictureId());
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_FAILURE);
        }
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param pictureVo
     * @return
     */
    public ResultInfo findByPictureId(PictureVo pictureVo){
        Picture picture = pictureMapper.selectByPrimaryKey(pictureVo.getPictureId());
        if (ObjectUtil.isEmpty(picture)) {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_NOT_EXIST);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_EXIST);
        }
    }
}
