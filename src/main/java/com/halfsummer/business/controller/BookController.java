package com.halfsummer.business.controller;

import com.halfsummer.baseframework.result.DataGridResultInfo;
import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.service.BookService;
import com.halfsummer.business.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BestClever
 * @title: BookController
 * @projectName media-library-manage
 * @description: 图书 控制类
 * @date 2020-07-01 22:09
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/index")
    public String index() {
        return "book/index";
    }

    @RequestMapping(value = "/edit")
    public String edit() {
        return "book/edit";
    }

    @RequestMapping(value = "/add")
    public String add() {
        return "book/add";
    }

    /**
     * 查询
     * @param bookVo
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public DataGridResultInfo list(BookVo bookVo){
       return bookService.listBook(bookVo);
    }

    /**
     * 新增
     * @param bookVo
     * @return
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public ResultInfo save(BookVo bookVo){
        return bookService.save(bookVo);
    }

    /**
     * 修改
     * @param bookVo
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public ResultInfo update(BookVo bookVo){
        return bookService.update(bookVo);
    }

    /**
     * 删除
     * @param bookVo
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public ResultInfo delete(BookVo bookVo){
        return bookService.delete(bookVo);
    }

    /**
     * 根据主键查询 数据的存在 与否
     * @param bookVo
     * @return
     */
    @RequestMapping(value = "/findByBookId")
    @ResponseBody
    public ResultInfo findByBookId(BookVo bookVo){
        return bookService.findByBookId(bookVo);
    }


}
