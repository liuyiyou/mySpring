package cn.liuyiyou.spring;

import cn.liuyiyou.spring.strategy.AppConfig;
import cn.liuyiyou.spring.strategy.ContextSpringFactory;
import cn.liuyiyou.spring.strategy.PrintStrategy;
import cn.liuyiyou.spring.strategy.Strategy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liuyiyou.cn
 * @date: 2018/10/18
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
public class StrategyTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContextSpringFactory bean = context.getBean(ContextSpringFactory.class);
        System.out.println(bean.doAction("write"));
        System.out.println(bean.doAction("print"));
    }
}
