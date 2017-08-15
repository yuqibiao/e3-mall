package com.yyyu.manager.controller;

import com.yyyu.manager.bean.BaseJsonResult;
import com.yyyu.manager.inter.TagTypeBiz;
import com.yyyu.manager.pojo.TagType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能：标签类型
 *
 * @author yu
 * @date 2017/8/10.
 */
@Controller
@RequestMapping("tag")
public class TagTypeController {

    @Autowired
    private TagTypeBiz tagTypeBiz;

    @RequestMapping(value = "getTagType")
    @ResponseBody
    public BaseJsonResult<List<TagType>> getTagType(){
        BaseJsonResult<List<TagType>> result = new BaseJsonResult<>();
        List<TagType> tagType = tagTypeBiz.getTagType();
        result.setResultCode(200);
        result.setMsg("获取标签类型成功");
        result.setResultData(tagType);
        return result;
    }

}
