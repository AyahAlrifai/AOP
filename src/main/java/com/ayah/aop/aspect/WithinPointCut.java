package com.ayah.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * example 4
 */
@Aspect
@Component
public class WithinPointCut {

    @Pointcut(value = "within(com.ayah.aop.service.AspectService2)")
    public void executionAllMethod() {
    }

    @Before(value = "executionAllMethod()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before ->" + joinPoint.getSignature());
    }

    @After(value = "executionAllMethod()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After ->" + joinPoint.getSignature());
    }

    @Around(value = "executionAllMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around-Before ->" + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.out.println("Around-After ->" + joinPoint.getSignature());
        return result;
    }

    /*
    AspectService1 -> test1 -> Ayah Al-Refai
    ####################################################################################
    AspectService1 -> test2 -> 12
    ####################################################################################
    Around-Before ->String com.ayah.aop.service.AspectService2.test1(String,String)
    Before ->String com.ayah.aop.service.AspectService2.test1(String,String)
    AspectService2 -> test1 -> Al-Refai Ayah
    After ->String com.ayah.aop.service.AspectService2.test1(String,String)
    Around-After ->String com.ayah.aop.service.AspectService2.test1(String,String)
    ####################################################################################
    Around-Before ->Integer com.ayah.aop.service.AspectService2.test2(Integer,Integer)
    Before ->Integer com.ayah.aop.service.AspectService2.test2(Integer,Integer)
    AspectService2 -> test2 -> 10
    After ->Integer com.ayah.aop.service.AspectService2.test2(Integer,Integer)
    Around-After ->Integer com.ayah.aop.service.AspectService2.test2(Integer,Integer)
     */

}

