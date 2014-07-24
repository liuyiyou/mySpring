package com.github.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public class ConstructDiTest {
    @Test
    public void testSayHello() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext("constructDi.xml");
        HelloApi helloApi = factory.getBean("byIndex",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byType",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byName",HelloApi.class);
        helloApi.sayHello();
    }

}
