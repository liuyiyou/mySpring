package cn.liuyiyou.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/26
 * @version: V1.0
 */
@Configuration
@ComponentScan(basePackages = "cn.liuyiyou",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
//@ComponentScan(basePackages = "cn.liuyiyou", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = RestController.class)
//})
public class AppConfig {
}
