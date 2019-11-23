package com.xiao.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.xiao.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import javax.sql.DataSource;

/**
 * @Description druid数据源配置类
 * @Auther: 笑笑是一个码农
 * @Date: 22:08 2019/11/20
 */
@Configuration //声明该类是一个配置类
//@PropertySource("classpath:db.properties") //指定外部配置文件
@EnableConfigurationProperties(JdbcProperties.class) //启用我们的JdbcProperties属性配置文件
public class DruidConfig {


//    // @Value该注解可以读取配置文件，把值注入到我们的变量当中
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.driverClassName}")
//    private String driverClassName;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;

//    @Autowired
//    private JdbcProperties jdbcProperties; //注入我们的属性配置文件

    @Bean //实例化一个bean，该注解会把方法的返回值注入到spring容器中,bean名称默认为方法的名称
    //@Bean("你要修改的bean名称") 我们也可以自行制定bean的名称
    public DataSource dataSource(JdbcProperties jdbcProperties){ //在方法的参数中直接使用
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }

     //不建议使用这种方式，可读性太差
//    @Bean //实例化一个bean，该注解会把方法的返回值注入到spring容器中,bean名称默认为方法的名称
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource(){
//       return new DruidDataSource();
//    }
}


