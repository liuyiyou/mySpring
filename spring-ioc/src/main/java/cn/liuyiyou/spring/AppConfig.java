package cn.liuyiyou.spring;

import cn.liuyiyou.spring.ioc.HelloApi;
import cn.liuyiyou.spring.ioc.HelloImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @author: liuyiyou
 * @date: 2018/2/7
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloApi helloApi() {
        return new HelloImpl();
    }
}
