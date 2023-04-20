package com.reservation.demo.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * This aspect deals with request and response logging
 *
 * @author deshan
 * @since 1.1
 */
@Aspect
@Component
public class LoggerAOP {

    Logger logger = LoggerFactory.getLogger(LoggerAOP.class);

    @Pointcut("execution(* com.reservation.demo.controller.*.*(..))")
    public void loggerPointCut() {
    }

    @Around("loggerPointCut()")
    public Object loggerAdvice(ProceedingJoinPoint pjp) throws Throwable {
        ObjectMapper mapper = new ObjectMapper();
        Object[] args = pjp.getArgs();
        logger.info(mapper.writeValueAsString(args));
        Object response = pjp.proceed();
        logger.info(mapper.writeValueAsString(response));
        return response;
    }
}
