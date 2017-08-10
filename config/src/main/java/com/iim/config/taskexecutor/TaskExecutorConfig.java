package com.iim.config.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by xibin on 2017/8/10.
 */
@ConfigurationProperties("taskexecutor")
@Configuration
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    private int corepoolsize;

    private int maxpoolsize;

    private int queuecapacity;

    private String threadnameprefix;

    public String getThreadnameprefix() {
        return threadnameprefix;
    }

    public void setThreadnameprefix(String threadnameprefix) {
        this.threadnameprefix = threadnameprefix;
    }

    public int getCorepoolsize() {
        return corepoolsize;
    }

    public void setCorepoolsize(int corepoolsize) {
        this.corepoolsize = corepoolsize;
    }

    public int getMaxpoolsize() {
        return maxpoolsize;
    }

    public void setMaxpoolsize(int maxpoolsize) {
        this.maxpoolsize = maxpoolsize;
    }

    public int getQueuecapacity() {
        return queuecapacity;
    }

    public void setQueuecapacity(int queuecapacity) {
        this.queuecapacity = queuecapacity;
    }

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(corepoolsize);
        taskExecutor.setMaxPoolSize(maxpoolsize);
        taskExecutor.setQueueCapacity(queuecapacity);
        taskExecutor.setThreadNamePrefix(threadnameprefix);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new SimpleAsyncUncaughtExceptionHandler();
    }
}
