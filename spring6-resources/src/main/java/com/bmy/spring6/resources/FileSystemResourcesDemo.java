package com.bmy.spring6.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:FileSystemResourcesDemo
 * Package:com.bmy.spring6.resources
 * Description:
 *
 * @Creat:2024/4/10
 */
public class FileSystemResourcesDemo {
    public static void loadFileResources(String path){
        FileSystemResource fileSystemResources = new FileSystemResource(path);
        System.out.println(fileSystemResources.getFilename());
        System.out.println(fileSystemResources.getDescription());
        try {
            InputStream inputStream = fileSystemResources.getInputStream();
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
        loadFileResources("D:\\bai\\数据\\getP\\6.14trmloc_dat.txt");
    }
}
