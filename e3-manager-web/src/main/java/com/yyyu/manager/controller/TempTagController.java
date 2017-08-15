package com.yyyu.manager.controller;

import com.yyyu.manager.bean.BaseJsonRequest;
import com.yyyu.manager.bean.BaseJsonResult;
import com.yyyu.manager.inter.TempTagBiz;
import com.yyyu.manager.pojo.TempTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能：标签操作相关Controller
 *
 * @author yu
 * @date 2017/8/9.
 */

@Controller
@RequestMapping("tag")
public class TempTagController {

    @Autowired
    private TempTagBiz tempTagBiz;

    @RequestMapping(value = "/addTag")
    @ResponseBody
    public BaseJsonResult<String> addTag(@RequestBody BaseJsonRequest<  List<TempTag>> data){
        List<TempTag> tempTagList =data.getRequestData();
        BaseJsonResult<String> result = new BaseJsonResult<>();
        tempTagBiz.addTag(tempTagList);
        result.setResultCode(200);
        result.setMsg("保存tag成功");
        result.setResultData("保存数据条数："+tempTagList.size());
        return result;
    }

}
