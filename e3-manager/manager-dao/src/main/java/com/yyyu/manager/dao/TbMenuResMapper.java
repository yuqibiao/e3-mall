package com.yyyu.manager.dao;

import com.yyyu.manager.pojo.TbMenuRes;

public interface TbMenuResMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(TbMenuRes record);

    int insertSelective(TbMenuRes record);

    TbMenuRes selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(TbMenuRes record);

    int updateByPrimaryKey(TbMenuRes record);
}