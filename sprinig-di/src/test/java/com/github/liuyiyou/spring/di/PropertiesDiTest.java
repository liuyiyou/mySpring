package com.github.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesDiTest {

    @Test
    public void testArrayDi() {
        BeanFactory factory = new ClassPathXmlApplicationContext("propDi.xml");
        PropertiesDi propDi = factory.getBean("propDi", PropertiesDi.class);

        Properties properties = propDi.getValues();

        System.out.println(properties.getProperty("key1"));
        System.out.println(properties.getProperty("key2"));
    }
}
