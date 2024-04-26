package com.bmy.spring6.validator.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * ClassName:MyValidation2
 * Package:com.bmy.spring6.validator.two
 * Description:
 *
 * @Creat:2024/4/12
 */
@Service
public class MyValidation2 {
    @Autowired
    private Validator validator;
    public boolean validatorUserTwo(User user){
        BindException bindException=new BindException(user,user.getName());
        validator.validate(user,bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }
}
