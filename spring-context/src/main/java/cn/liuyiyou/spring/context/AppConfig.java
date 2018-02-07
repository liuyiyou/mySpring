package cn.liuyiyou.spring.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/***
 * @author: liuyiyou
 * @date: 2018/2/7
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class AppConfig {


    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    public AppConfig() {
        System.out.println("in appConfig");
        System.out.println(
                "url::" + url
                        + "\tusername::" + username
                        + "\tpassword::" + password
                        + "\tdriverClassName::" + driverClassName);
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return placeholderConfigurer;
    }


}
