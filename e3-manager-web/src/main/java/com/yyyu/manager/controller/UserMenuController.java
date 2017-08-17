package com.yyyu.manager.controller;

import com.yyyu.manager.bean.BaseJsonResult;
import com.yyyu.manager.dao.UserMenuMapper;
import com.yyyu.manager.inter.UserMenuBizInter;
import com.yyyu.manager.pojo.TbMenuRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/17.
 */
@Controller
@RequestMapping("user/menu")
public class UserMenuController {

    @Autowired
    private UserMenuBizInter userMenuBiz;

    @RequestMapping("/{userId}")
    @ResponseBody
    public BaseJsonResult<List<TbMenuRes>> getUserMenuByUserId(@PathVariable long userId){
        BaseJsonResult<List<TbMenuRes>> result = new BaseJsonResult<>();
        List<TbMenuRes> menuList = userMenuBiz.getMenuByUserId(userId);
        for (TbMenuRes menu: menuList) {
            if (menu.getParentId()==null){

            }
        }
        result.setMsg("获取菜单数据成功");
        result.setResultCode(200);
        result.setResultData(menuList);
        return result;
    }

}
