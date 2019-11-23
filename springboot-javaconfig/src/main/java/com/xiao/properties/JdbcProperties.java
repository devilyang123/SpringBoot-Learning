package com.xiao.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description 数据源属性配置类
 * @Auther: 笑笑是一个码农
 * @Date: 22:36 2019/11/20
 */
@Data //lombok注解,省略getter/setter等方法
//声明该类是一个属性配置文件，同时指定属性在配置文件中的前缀
@ConfigurationProperties(prefix = "spring.datasource")
// 属性名要与配置文件中保持一致
public class JdbcProperties {

    private String url;

    private String driverClassName;

    private String username;

    private String password;
}
