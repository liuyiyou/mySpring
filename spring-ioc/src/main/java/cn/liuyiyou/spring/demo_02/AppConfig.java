package cn.liuyiyou.spring.demo_02;

import org.springframework.context.annotation.Bean;

/**
 * @author: liuyiyou.cn
 * @date: 2018/7/26
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
public class AppConfig {

    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
