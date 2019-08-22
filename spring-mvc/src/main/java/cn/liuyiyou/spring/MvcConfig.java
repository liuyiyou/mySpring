package cn.liuyiyou.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/26
 * @version: V1.0
 */
@Configuration
//@EnableWebMvc
@ComponentScan(basePackages = "cn.liuyiyou.spring.web")
//@EnableAspectJAutoProxy
//@ImportResource("classpath:spring-web.xml")
public class MvcConfig {//implements WebMvcConfigurer {

}
