package cn.liuyiyou.spring;

import cn.liuyiyou.spring.context.AppConfig;
import cn.liuyiyou.spring.context.BeanLife;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/29
 * @version: V1.0
 */
public class BeanLifeTest {

    @Test
    public void beanLife() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanLife bean = ctx.getBean(BeanLife.class);
        System.out.println(bean.toString());
        System.out.println(bean.getBeanName());
        System.out.println(bean.getApplicationContext());
        System.out.println(bean.getBeanFactory());
    }
}
