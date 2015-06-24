package com.uphyca.gradle.android.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


public aspect GoodbyeAspect {

    pointcut sayGoodbye() : execution(String me.zhangls.aspectandroiddemo.MainActivity.sayGoodbye());

    String around() : sayGoodbye() {
        return "Goodbye, @Aspect";
    }
}
