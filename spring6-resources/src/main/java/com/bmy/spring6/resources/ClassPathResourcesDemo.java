package com.bmy.spring6.resources;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:ClassPathResourcesDemo
 * Package:com.bmy.spring6.resources
 * Description:
 *
 * @Creat:2024/4/10
 */
public class ClassPathResourcesDemo {
    public static void loadClassPathResources(String path){
        ClassPathResource classPathResource = new ClassPathResource(path);
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
        try {
            InputStream inputStream = classPathResource.getInputStream();
            byte[] b=new byte[1024];
            int len;
            while ((len=inputStream.read(b)) !=-1){
                System.out.println(new String(b,0,len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadClassPathResources("bb.txt");
    }
}
