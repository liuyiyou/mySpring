package cn.liuyiyou.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:49
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByFactoryTest {
    @Test
    public void testNewInstance() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("instanceByFactory.xml") ;
        HelloApi helloApi = beanFactory.getBean("bean4",HelloApi.class);
        helloApi.sayHello();
    }
}
