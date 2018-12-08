package cn.liuyiyou.spring.ioc.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
    @Test
    public void testSayHello() throws Exception {
        ApplicationContext factory = new ClassPathXmlApplicationContext("hello.xml");
        for (String beanDefinitionName : factory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        HelloService helloService = factory.getBean("helloService", HelloService.class);
        helloService.sayHello("Hello aspect");
    }


    @Test
    public void testSayHello2() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("cn.liuyiyou.spring.ioc.aspectj");
        context.refresh();
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello("Hello aspect");
    }
}
