package com.demo.elasticJob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.demo.elasticJob.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by JeffPeng on 2017/6/6.
 */
public class TestJob implements SimpleJob {

    @Autowired
    private TestService testService;

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("test job start："+shardingContext.getShardingItem());
        testService.test(shardingContext.getShardingItem());
        System.out.println("test job end"+shardingContext.getShardingItem());
    }
}
