package com.yyyu.manager.dao;

import com.yyyu.manager.pojo.TbRole;

public interface TbRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}