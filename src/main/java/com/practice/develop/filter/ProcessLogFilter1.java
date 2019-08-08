package com.practice.develop.filter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebFilter;
import java.sql.Date;
import java.text.DateFormat;

/**
 * 日志过滤器
 * created by th
 */
@Service
public class ProcessLogFilter1 extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent event) {
        System.out.println("sssssssssssssssssssssssssssssssssss");
        //LoggerDisruptorQueue.publishEvent(loggerMessage);
        return FilterReply.ACCEPT;
    }
}  