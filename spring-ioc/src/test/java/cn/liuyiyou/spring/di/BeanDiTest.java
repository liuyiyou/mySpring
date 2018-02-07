package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 */
public class BeanDiTest {

    @Test
    public void testSayHello() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext("beanDi.xml");
        BeanDi beanDi = factory.getBean("beanDi", BeanDi.class);
        beanDi.sayHello();
    }
}
