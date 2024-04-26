package com.bmy.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * ClassName:ValidationConfig
 * Package:com.bmy.spring6.validator.two
 * Description:
 *
 * @Creat:2024/4/12
 */
@Configuration
@ComponentScan("com.bmy.spring6.validator.two")
public class ValidationConfig {
    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }
}
