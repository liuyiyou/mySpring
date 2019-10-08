package cn.liuyiyou.spring.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: liuyiyou.cn
 * @date: 2018/10/18
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
@Configuration
public class AppConfig {

    @Bean(name="print")
    public Strategy printStrategy() {
        return new PrintStrategy();
    }

    @Bean(name = "write")
    public Strategy writeStrategty(){
        return  new WriteStrategy();
    }

    @Bean
    public ContextSpringFactory contextSpringFactory (){
        return new ContextSpringFactory();
    }
}
