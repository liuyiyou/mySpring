package com.github.liuyiyou.spring.aop.aspectj;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:37
 * To change this template use File | Settings | File Templates.
 */
public class HelloServiceTest {
    @Test
    public void testSayHello() throws Exception {
         System.out.println("=================");
        BeanFactory factory = new ClassPathXmlApplicationContext("hello.xml");
        HelloService helloService = factory.getBean("helloService",HelloService.class);
        helloService.sayHello("Hello aspect");
    }
}
