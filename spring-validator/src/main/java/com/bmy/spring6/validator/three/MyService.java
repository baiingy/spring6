package com.bmy.spring6.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * ClassName:MyService
 * Package:com.bmy.spring6.validator.three
 * Description:
 *
 * @Creat:2024/4/12
 */

@Service
@Validated
public class MyService {
public String testMethod(@NotNull @Valid User user){
    return user.toString();
}

}
