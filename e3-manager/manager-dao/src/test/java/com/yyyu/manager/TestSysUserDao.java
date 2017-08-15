package com.yyyu.manager;

import com.yyyu.crm.dao.SysUserMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/1.
 */
public class TestSysUserDao extends BaseTest{

    Logger logger = Logger.getLogger(TestSysUserDao.class);

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void initTest() {
        logger.info("============记录dao测试日志=======");
    }

    @Test
    public void testAddSysUser(){
        sysUserMapper.getSysUserByUserId(15l);
    }

}
