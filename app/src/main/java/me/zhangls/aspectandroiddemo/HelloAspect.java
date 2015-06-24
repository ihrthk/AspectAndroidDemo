package me.zhangls.aspectandroiddemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HelloAspect {

    @Around("execution(String me.zhangls.aspectandroiddemo.MainActivity.sayHello())")
    public String around(ProceedingJoinPoint pj) throws Throwable {
        return "Hello, @Aspect1111";
    }
}
