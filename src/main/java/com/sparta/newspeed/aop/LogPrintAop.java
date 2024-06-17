package com.sparta.newspeed.aop;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Slf4j(topic = "Request")
@Aspect
@Component
public class LogPrintAop {

    @Pointcut("execution(* com.sparta.newspeed.controller.*.*(..))")
    private void allController() {}

    @Before("allController()")
    public void execute(JoinPoint joinPoint) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if (request != null) {
            String method = request.getMethod();
            String uri = request.getRequestURI();

            log.info("Method :{}", method);
            log.info("Uri :{}", uri);
        }
    }
}
