package com.halfsummer.business.service;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.vo.BookVo;

/**
 * @author BestClever
 * @title: BookService
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-02 17:23
 */
public interface BookService {

    DataGridResultInfo listBook(BookVo bookVo);

    ResultInfo save(BookVo bookVo);

    ResultInfo update(BookVo bookVo);

    ResultInfo delete(BookVo bookVo);

    ResultInfo findByBookId(BookVo bookVo);
}
