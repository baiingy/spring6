package com.bmy.reflect;

/**
 * ClassName:Car
 * Package:com.bmy.reflect
 * Description:
 *
 * @Creat:2024/4/2
 */
public class Car {
    private String name;
    private int age;
    private String color;
    private void run(){
        System.out.println("private run()...............");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    private Car() {
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
