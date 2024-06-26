package com.bmy.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName:LogAspect
 * Package:com.bmy.spring6.aop.annoaop
 * Description:
 *
 * @Creat:2024/4/3
 */
@Component
@Aspect
public class LogAspect {
    @Before(value = "execution(public int com.bmy.spring6.aop.annoaop.CalculateImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        //获取连接点的签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }

    @AfterReturning(value = "execution(public int com.bmy.spring6.aop.annoaop.CalculateImpl.*(..))",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名：" + methodName + "，结果：" + result);
    }

    @AfterThrowing(value = "execution(* com.bmy.spring6.aop.annoaop.CalculateImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名：" + methodName + "，异常：" + ex);
    }

    @After("execution(public int com.bmy.spring6.aop.annoaop.CalculateImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名："+methodName);
    }

    @Around("execution(public int com.bmy.spring6.aop.annoaop.CalculateImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标方法的执行，目标方法的返回值一定要返回给外界调用者
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }

}
