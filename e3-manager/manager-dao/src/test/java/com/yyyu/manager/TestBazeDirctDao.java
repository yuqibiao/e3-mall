package com.yyyu.manager;

import com.yyyu.crm.dao.BaseDictMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/1.
 */
public class TestBazeDirctDao extends BaseTest{

    Logger logger = Logger.getLogger(TestBazeDirctDao.class);

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public void initTest() {
        logger.info("============记录dao测试日志=======");
    }

    @Test
    public void testGetBaseDictByTypeCode(){
        baseDictMapper.getBaseDictByTypeCode("002");
    }

}
