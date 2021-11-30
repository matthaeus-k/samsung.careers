package com.samsung.careers.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TimeTraceAop {

    @Around("execution(* com.samsung.careers..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long st = System.currentTimeMillis();
        System.out.println("ST: " + joinPoint.toString());
        try {
            Object rtn = joinPoint.proceed();
            return rtn;
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - st;
            System.out.println("END: " + joinPoint.toString()+ " " + timeMs +"ms");
        }
    }

}
