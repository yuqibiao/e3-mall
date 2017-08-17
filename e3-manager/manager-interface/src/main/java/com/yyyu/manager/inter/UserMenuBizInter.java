package com.yyyu.manager.inter;

import com.yyyu.manager.pojo.TbMenuRes;

import java.util.List;

/**
 * 功能：用户权限
 *
 * @author yu
 * @date 2017/8/17.
 */
public interface UserMenuBizInter {
    List<TbMenuRes> getMenuByUserId(long userId);
}
