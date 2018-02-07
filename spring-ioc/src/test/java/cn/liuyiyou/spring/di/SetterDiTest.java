package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 */
public class SetterDiTest {
    @Test
    public void testSayHello() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("setDi.xml");
        HelloApi helloApi = factory.getBean("setDI",HelloApi.class);
        helloApi.sayHello();

    }
}
