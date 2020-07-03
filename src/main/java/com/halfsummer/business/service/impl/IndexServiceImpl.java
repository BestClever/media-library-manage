package com.halfsummer.business.service.impl;

import com.google.common.collect.Maps;
import com.halfsummer.baseframework.enums.CommonEnum;
import com.halfsummer.baseframework.result.ResultDataUtil;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.domain.BookExample;
import com.halfsummer.business.domain.PictureExample;
import com.halfsummer.business.domain.VideoExample;
import com.halfsummer.business.mapper.BookMapper;
import com.halfsummer.business.mapper.PictureMapper;
import com.halfsummer.business.mapper.VideoMapper;
import com.halfsummer.business.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author BestClever
 * @title: IndexServiceImpl
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 15:06
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Autowired
    private VideoMapper videoMapper;

    public ResultInfo indexData(){
        int bookCount = bookMapper.countByExample(new BookExample());//图书总数
        int pictureCount = pictureMapper.countByExample(new PictureExample());//图画总数
        int videoCount = videoMapper.countByExample(new VideoExample());//视频光盘总数
        int allCount = bookCount+pictureCount+videoCount;
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("allCount",allCount);
        map.put("bookCount",bookCount);
        map.put("pictureCount",pictureCount);
        map.put("videoCount",videoCount);
        return ResultDataUtil.createSuccess(CommonEnum.DATA_EXIST).setData(map);
    }

}
