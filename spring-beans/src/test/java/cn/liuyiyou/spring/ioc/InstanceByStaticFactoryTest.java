package cn.liuyiyou.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:24
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByStaticFactoryTest {
    @Test
    public void testNewInstance() throws Exception {
        //使用静态工厂方法
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instanceByStaticFactory.xml") ;
        HelloApi helloApi = beanFactory.getBean("bean3",HelloApi.class);
        helloApi.sayHello();

    }
}
