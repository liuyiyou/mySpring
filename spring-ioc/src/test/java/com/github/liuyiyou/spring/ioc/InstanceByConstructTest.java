package com.github.liuyiyou.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 002:bean 使用构造方法的实例化
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByConstructTest {
    @Test
    public void testSayHello() throws Exception {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instanceBean.xml");

        HelloApi helloApi = beanFactory.getBean("bean1",HelloApi.class);

        helloApi.sayHello();

        helloApi = beanFactory.getBean("bean2",HelloApi.class);

        helloApi.sayHello();

    }
}
