package com.yyyu.manager.biz;

import com.yyyu.manager.dao.UserMenuMapper;
import com.yyyu.manager.inter.UserMenuBizInter;
import com.yyyu.manager.pojo.TbMenuRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/17.
 */
@Service
public class UserMenuBiz implements UserMenuBizInter{

    @Autowired
    private UserMenuMapper userMenuMapper;

    @Override
    public List<TbMenuRes> getMenuByUserId(long userId) {
        return userMenuMapper.getUserMenuByUserId(userId);
    }
}
