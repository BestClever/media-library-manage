package com.halfsummer.business.service;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.vo.PictureVo;

/**
 * @author BestClever
 * @title: PictureService
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:46
 */
public interface PictureService {
    DataGridResultInfo listPicture(PictureVo pictureVo);

    ResultInfo save(PictureVo pictureVo);

    ResultInfo update(PictureVo pictureVo);

    ResultInfo delete(PictureVo pictureVo);

    ResultInfo findByPictureId(PictureVo pictureVo);
}
