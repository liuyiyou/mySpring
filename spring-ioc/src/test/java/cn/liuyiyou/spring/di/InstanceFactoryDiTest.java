package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InstanceFactoryDiTest {
    @Test
    public void testNewInstance() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext("instanceFactoryDi.xml");
        HelloApi helloApi = factory.getBean("byIndex",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byType",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byName",HelloApi.class);
        helloApi.sayHello();
    }
}
