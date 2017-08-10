package com.iim.test.concurrency;

import com.iim.test.base.BaseTest;
import com.iim.service.impl.concurrency.ConcurrencyTestService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Future;

/**
 * Created by xibin on 2017/8/10.
 */
public class ConcurrencyTester extends BaseTest {

    private final static Logger logger = LoggerFactory.getLogger(ConcurrencyTester.class);

    @Autowired
    ConcurrencyTestService concurrencyTestService;

    @Test
    public void testTask() {
        long start = System.currentTimeMillis();
        try {
            logger.info("--------------------------------------------\n");
            logger.info("每个任务执行的时间是：" + concurrencyTestService.doTime + "（毫秒）");

            Future<Long> task = concurrencyTestService.taskByAsync();

            concurrencyTestService.taskByVoid();

            long sync = concurrencyTestService.taskBySync();

            while (true) {
                if (task.isDone()) {
                    long async = task.get();
                    logger.info("异步任务执行的时间是：" + async + "（毫秒）");
                    // logger.info("注解任务执行的时间是： -- （毫秒）");
                    logger.info("同步任务执行的时间是：" + sync + "（毫秒）");
                    break;
                }
            }
            logger.info("--------------------------------------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("\t........响应时间为：" + (end - start) + "（毫秒）");
    }

}
