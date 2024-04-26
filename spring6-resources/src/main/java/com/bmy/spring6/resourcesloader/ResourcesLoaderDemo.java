package com.bmy.spring6.resourcesloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ClassName:ResourcesLoaderDemo
 * Package:com.bmy.spring6.resourcesloader
 * Description:
 *
 * @Creat:2024/4/10
 */
public class ResourcesLoaderDemo {
    @Test
    public void Demo1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext();
        Resource resource = applicationContext.getResource("bb.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void Demo2(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext();
        Resource resource = applicationContext.getResource("bb.txt");
        System.out.println(resource.getFilename());
    }
}
