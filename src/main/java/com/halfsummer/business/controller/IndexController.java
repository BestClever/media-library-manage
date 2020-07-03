package com.halfsummer.business.controller;

import com.halfsummer.baseframework.result.ResultInfo;
import com.halfsummer.business.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BestClever
 * @title: IndexController
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-02 17:36
 */
@Controller
@RequestMapping
public class IndexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/main")
    public String main() {
        return "main";
    }

    @RequestMapping(value = "/indexData")
    @ResponseBody
    public ResultInfo indexData() {
        return indexService.indexData();
    }
}
