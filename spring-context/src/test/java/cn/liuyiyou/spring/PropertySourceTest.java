package cn.liuyiyou.spring;

import cn.liuyiyou.spring.context.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {


    @Test
    public void proertySourceTest() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        System.out.println(ctx.getEnvironment().containsProperty("jdbc.url"));
    }
}
