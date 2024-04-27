package com.bmy.test;

import com.bmy.config.JavaConfig;
import com.bmy.service.StudentService;
import com.bmy.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:SpringTxTest
 * Package:com.bmy.test
 * Description:
 *
 * @Creat:2024/4/26
 */
@SpringJUnitConfig(JavaConfig.class)
public class SpringTxTest {
    @Autowired
    private StudentService studentService;

    @Autowired
    private TopService topService;
    @Test
    public void test1(){
        topService.topService();
    }
}
