package cn.liuyiyou.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InstanceByConstructTest {
    @Test
    public void testSayHello() {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instanceBean.xml");

        HelloApi helloApi = beanFactory.getBean("bean1", HelloApi.class);

        helloApi.sayHello();

        helloApi = beanFactory.getBean("bean2", HelloApi.class);

        helloApi.sayHello();

    }
}
