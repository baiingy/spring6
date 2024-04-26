package com.bmy.spring6.prefix;

import com.bmy.spring6.resourcesloaderaware.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName:TestDemo
 * Package:com.bmy.spring6.prefix
 * Description:
 *
 * @Creat:2024/4/10
 */
public class TestDemo {

    public static void main(String[] args) {
        //通配符*----加载bean开头的
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean*.xml");
//        Resource resource = context.getResource("bb.txt");
//        System.out.println(resource.getFilename());

        TestBean testBean = context.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println(context == resourceLoader);

    }
}
