package com.yyyu.manager.dao;

import com.yyyu.manager.pojo.TbMenuRes;

import java.util.List;

/**
 * 功能：权限控制
 *
 * @author yu
 * @date 2017/8/17.
 */
public interface UserMenuMapper {
    List<TbMenuRes> getUserMenuByUserId(long userId);
    /*
    * 得到负菜单下的子菜单
    * */
    List<TbMenuRes> getChildMenuByParentId(long userId , int parentId);
}
