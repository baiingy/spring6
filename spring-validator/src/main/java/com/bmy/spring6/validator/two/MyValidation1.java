package com.bmy.spring6.validator.two;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * ClassName:MyValidation1
 * Package:com.bmy.spring6.validator.two
 * Description:
 *
 * @Creat:2024/4/12
 */
@Service
public class MyValidation1 {
    @Autowired
    private Validator validator;
    public boolean validatorUserOne(User user){
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }


}
