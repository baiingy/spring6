package com.bmy.spring6.validator.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * ClassName:ValidationConfig
 * Package:com.bmy.spring6.validator.three
 * Description:
 *
 * @Creat:2024/4/12
 */
@Configuration
@ComponentScan("com.bmy.spring6.validator.three")
public class ValidationConfig {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor(){
        return new MethodValidationPostProcessor();
    }

}
