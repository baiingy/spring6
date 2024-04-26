package com.bmy.spring6.resources;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * ClassName:UrlResourcesDemo
 * Package:com.bmy.spring6.resources
 * Description:
 *
 * @Creat:2024/4/10
 */
public class UrlResourcesDemo {
    public static void main(String[] args) {
        loadUrlResources("http://www.baidu.com");
        loadUrlResources("file:bb.txt");
    }
    public static void loadUrlResources(String path){
        try {
            UrlResource urlResource = new UrlResource(path);
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURI());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
