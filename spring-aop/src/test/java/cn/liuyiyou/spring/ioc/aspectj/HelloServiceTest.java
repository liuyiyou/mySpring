package cn.liuyiyou.spring.ioc.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
    @Test
    public void testSayHello() throws Exception {
        ApplicationContext factory = new ClassPathXmlApplicationContext("hello.xml");
        do {
            for (String beanDefinitionName : factory.getBeanDefinitionNames()) {
                System.out.println("xxxx");
                System.out.println(beanDefinitionName);
            }
        } while (factory.getParent() != null);
        HelloService helloService = factory.getBean("helloService", HelloService.class);
        helloService.sayHello("Hello aspect");
    }
}
