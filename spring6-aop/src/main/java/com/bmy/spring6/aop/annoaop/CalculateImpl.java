package com.bmy.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

/**
 * ClassName:CalculateImpl
 * Package:com.bmy.spring6.aop.annoaop
 * Description:
 *
 * @Creat:2024/4/3
 */
@Component
public class CalculateImpl implements Calculate{
    @Override
    public int add(int i, int j) {

        int result = i + j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
