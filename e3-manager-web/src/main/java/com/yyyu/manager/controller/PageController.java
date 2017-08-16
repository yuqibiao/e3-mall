package com.yyyu.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能：页面跳转
 *
 * @author yu
 * @date 2017/8/16.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){

        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }


}
