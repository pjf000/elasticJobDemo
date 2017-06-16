package com.demo.elasticJob.service.impl;

import com.demo.elasticJob.service.TestService;

/**
 * Created by jeffpeng on 2017/6/15.
 */
public class TestServiceImpl implements TestService{
    public Integer test(Integer num) {
        System.out.println("call TestService test function！param:"+num);
        return 1;
    }
}
