package com.bmy.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:TestCar
 * Package:com.bmy.reflect
 * Description:
 *
 * @Creat:2024/4/2
 */
public class TestCar {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        //获取Class对象
//        //1.类名.class
//        Class cClass = Car.class;
//        //2.对象.getclass()
//        Class aClass = new Car().getClass();
//        //3.forName("全路径")
//        Class rClass = Class.forName("com.bmy.reflect.Car");
//
//        Car car = (Car) rClass.getDeclaredConstructor().newInstance();

    }

    @Test
    public void test2() throws Exception {

        //获取构造方法
        Class carClass = Car.class;
        /*Constructor[] constructors1 = carClass.getDeclaredConstructors();//所有public和private构造方法
        Constructor[] constructors2 = carClass.getConstructors();//所有public构造方法
        for (Constructor c:constructors1) {
            System.out.println(c.getName()+"\t"+c.getParameterCount());
        }*/

        Constructor constructor = carClass.getDeclaredConstructor();
        constructor.setAccessible(true);//私有构造器设置
        Car car = (Car) constructor.newInstance();
        System.out.println(car);
    }

    @Test
    public void test3() throws Exception {

        Class carClass = Car.class;
        Constructor constructor = carClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Car car = (Car) constructor.newInstance();
        Field[] fields = carClass.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println(f.getName());
            if (f.getName().equals("name")) {
                f.set(car, "bas");
            }
        }
        System.out.println(car);

        Method[] methods = carClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
            if (m.getName().equals("run")){
                m.setAccessible(true);
                m.invoke(car);
            }
        }
    }
}
