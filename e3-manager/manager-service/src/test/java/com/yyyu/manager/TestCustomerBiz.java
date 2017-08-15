package com.yyyu.manager;

import com.yyyu.crm.biz.CustomerBiz;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/2.
 */
public class TestCustomerBiz extends BaseTest{

    private Logger logger;

    @Autowired
    private CustomerBiz customerBiz;

    @Override
    public void initTest() {
        logger = Logger.getLogger(TestCustomerBiz.class);
    }

    @Test
    public void testGetCustomerByCustId(){
        customerBiz.getCustomerByCustId(15l);
    }

}
