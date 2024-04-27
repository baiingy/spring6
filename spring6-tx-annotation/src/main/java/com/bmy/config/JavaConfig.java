package com.bmy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName:JavaConfig
 * Package:com.bmy.config
 * Description:
 *
 * @Creat:2024/4/26
 */
@Configuration
@ComponentScan("com.bmy")
@PropertySource("classpath:jdbc.properties")
//@EnableAspectJAutoProxy
@EnableTransactionManagement
public class JavaConfig {
    @Value("${bmy.url}")
    private String url;
    @Value("${bmy.driver}")
    private String driver;
    @Value("${bmy.username}")
    private String username;
    @Value("${bmy.password}")
    private String password;
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public TransactionManager transactionManager( DataSource dataSource){

        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
