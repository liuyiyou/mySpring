package cn.liuyiyou.spring.context;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DiTest {

    @Test
    public void setDiTest() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("setDi.xml");
        HelloApi helloApi = factory.getBean("setDI",HelloApi.class);
        helloApi.sayHello();

    }

    @Test
    public void beanDiTest() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("beanDi.xml");
        BeanDi beanDi = factory.getBean("beanDi", BeanDi.class);
        beanDi.sayHello();
    }

    @Test
    public void arrayDiTest() {
        BeanFactory factory = new ClassPathXmlApplicationContext("arrayDi.xml");
        ArrayDi arrayDi = factory.getBean("arrayDi", ArrayDi.class);
        System.out.println(arrayDi.getArray().length); //3
        System.out.println(arrayDi.getArray2().length);
    }

    @Test
    public void constructDiTest() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext("constructDi.xml");
        HelloApi helloApi = factory.getBean("byIndex", HelloApi.class);
        helloApi.sayHello();
        helloApi = factory.getBean("byType", HelloApi.class);
        helloApi.sayHello();
        helloApi = factory.getBean("byName", HelloApi.class);
        helloApi.sayHello();
    }

    @Test
    public void listDiTest() {
        BeanFactory factory = new ClassPathXmlApplicationContext("listDi.xml");
        ListDi listDi = factory.getBean("listDi", ListDi.class);
        System.out.println(listDi.getValues().size());
    }

    @Test
    public void mapDiTest() {
        BeanFactory factory = new ClassPathXmlApplicationContext("mapDi.xml");
        MapDi mapDi = factory.getBean("mapDi", MapDi.class);
        Map<String, String> maps = mapDi.getValues();
        Set<String> keySet = maps.keySet();
        for (String key : keySet) {
            //循环取出了你map里面的值然后再调用你的sql方法想怎么存就怎么存
            System.out.println(key + " = " + maps.get(key));
        }
    }

    @Test
    public void newInstanceDiTest() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext("instanceFactoryDi.xml");
        HelloApi helloApi = factory.getBean("byIndex",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byType",HelloApi.class);
        helloApi.sayHello();

        helloApi = factory.getBean("byName",HelloApi.class);
        helloApi.sayHello();
    }

    @Test
    public void staticFactoryDiTest() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("staticFactoryDi.xml");
        HelloApi helloApi = factory.getBean("byIndex",HelloApi.class);
        helloApi.sayHello();
        helloApi = factory.getBean("byType",HelloApi.class);
        helloApi.sayHello();
        helloApi = factory.getBean("byName",HelloApi.class);
        helloApi.sayHello();
    }

    @Test
    public void propertiesDiTest() {
        BeanFactory factory = new ClassPathXmlApplicationContext("propDi.xml");
        PropertiesDi propDi = factory.getBean("propDi", PropertiesDi.class);
        Properties properties = propDi.getValues();
        System.out.println(properties.getProperty("key1"));
        System.out.println(properties.getProperty("key2"));
    }
}
