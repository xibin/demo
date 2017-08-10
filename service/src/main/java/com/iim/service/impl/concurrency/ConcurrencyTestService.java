package com.iim.service.impl.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by xibin on 2017/8/10.
 */
@Service
public class ConcurrencyTestService {

    private final static Logger logger = LoggerFactory.getLogger(ConcurrencyTestService.class);

    public final static int doTime = 5000;

    @Async
    public Future<Long> taskByAsync() throws InterruptedException {
        long start = System.currentTimeMillis();
        long sum = 0;
        Thread.sleep(doTime);
        long end = System.currentTimeMillis();
        sum = end - start;
        logger.info("\t 完成任务一   ");
        return new AsyncResult<>(sum);
    }

    @Async
    public void taskByVoid() throws Exception {
        long start = System.currentTimeMillis();
        long sum = 0;
        Thread.sleep(doTime);
        long end = System.currentTimeMillis();
        sum = end - start;
        logger.info("\t 完成异步任务二   ");
        logger.info("任务二执行的时间是： " + sum + "（毫秒）");
    }

    public long taskBySync() throws Exception {
        long start = System.currentTimeMillis();
        long sum = 0;
        Thread.sleep(doTime);
        long end = System.currentTimeMillis();
        sum = end - start;
        logger.info("\t 完成任务三   ");
        logger.info("任务三执行的时间是： " + sum + "（毫秒）");
        return sum;
    }
}
