package org.learningSpring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* org.learningSpring.services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("Before");
//    }
//
//    @After("execution(* org.learningSpring.services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("After");
//    }
//
//    @AfterReturning("execution(* org.learningSpring.services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("After Returning");
//    }
//
//    @AfterThrowing("execution(* org.learningSpring.services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("After Throwing");
//    }

    @Around("execution(* org.learningSpring.services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("Something Else !!!");
        Object result = null;
        try {
            joinPoint.proceed();  // Can call proceed multiple times
//            System.out.println(result);
            result = joinPoint.proceed(new Object[]{"Billy"});  // Can change the arguments provided
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
