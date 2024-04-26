package com.bmy.spring6.validator.one;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * ClassName:Personvalidator
 * Package:com.bmy.spring6.validator.one
 * Description:
 *
 * @Creat:2024/4/10
 */
public class Personvalidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty","name is null");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "error.value < 0");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "error.value.too old");
        }
    }
}
