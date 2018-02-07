package cn.liuyiyou.spring.aop;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloServiceTest {
    @Test
    public void testSayHello() throws Exception {
        BeanFactory factory  = new ClassPathXmlApplicationContext("hello.xml");

        HelloService helloService = factory.getBean("helloService",HelloService.class);

        helloService.sayHello();
    }
}
