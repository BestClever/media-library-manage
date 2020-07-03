package com.halfsummer.business.service.impl;

import cn.hutool.core.io.resource.ResourceUtil;
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
import com.halfsummer.business.domain.BookExample;
import com.halfsummer.business.mapper.BookMapper;
import com.halfsummer.business.service.BookService;
import com.halfsummer.business.vo.BookVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BestClever
 * @title: BookServiceImpl
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-02 17:23
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询 列表
     * @param bookVo
     * @return
     */
    public DataGridResultInfo listBook(BookVo bookVo){
        PageWrapper pageWrapper = new PageWrapper();
        BookExample bookExample = new BookExample();
        BookExample.Criteria criteria = bookExample.createCriteria();
        if(!ObjectUtil.isEmpty(bookVo)){
            if(StrUtil.isNotEmpty(bookVo.getBookId())){
                criteria.andBookIdEqualTo(bookVo.getBookId());
            }
            if(StrUtil.isNotEmpty(bookVo.getBookTitle())){
                criteria.andBookTitleLike("%"+bookVo.getBookTitle()+"%");
            }
        }
        PageHelper.startPage(bookVo.getPage(),bookVo.getLimit());
        List<Book> bookList = bookMapper.selectByExample(bookExample);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        pageWrapper.setList(bookPageInfo.getList());
        pageWrapper.setTotal(bookPageInfo.getTotal());
        return ResultDataUtil.createQueryResult(pageWrapper);
    }

    /**
     * 新增
     * @param bookVo
     * @return
     */
    public ResultInfo save(BookVo bookVo){
        //判断总数是否大于最大值
        int bookCount = bookMapper.countByExample(new BookExample());
        int bookMaxCount = Integer.valueOf(ResourcesUtil.getValue("resource.config", "bookMaxCount"));
        if (bookCount>bookMaxCount) {
            return ResultDataUtil.createFail(CommonEnum.REPERTORY_FULL);
        }
        Book book = new Book();
        BeanUtils.copyProperties(bookVo,book);
        int b = bookMapper.insert(book);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.ADD_FAILURE);
        }
    }

    /**
     * 新增
     * @param bookVo
     * @return
     */
    public ResultInfo update(BookVo bookVo){
        Book book = new Book();
        BeanUtils.copyProperties(bookVo,book);
        int b = bookMapper.updateByPrimaryKey(book);
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.UPDATE_FAILURE);
        }
    }

    /**
     * 删除
     * @param bookVo
     * @return
     */
    public ResultInfo delete(BookVo bookVo){
        int b = bookMapper.deleteByPrimaryKey(bookVo.getBookId());
        if (b>0) {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_SUCESS);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.REMOVE_FAILURE);
        }
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param bookVo
     * @return
     */
    public ResultInfo findByBookId(BookVo bookVo){
        Book book = bookMapper.selectByPrimaryKey(bookVo.getBookId());
        if (ObjectUtil.isEmpty(book)) {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_NOT_EXIST);
        }else {
            return ResultDataUtil.createSuccess(CommonEnum.DATA_EXIST);
        }
    }
}
