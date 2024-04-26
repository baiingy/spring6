package com.bmy.spring6.di;

import org.springframework.core.io.Resource;

/**
 * ClassName:ResouceBean
 * Package:com.bmy.spring6.di
 * Description:
 *
 * @Creat:2024/4/10
 */
public class ResouceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
