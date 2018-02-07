package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
public class ArrayDiTest {

    @Test
    public void testArrayDi() {
        BeanFactory factory = new ClassPathXmlApplicationContext("arrayDi.xml");
        ArrayDi arrayDi = factory.getBean("arrayDi", ArrayDi.class);
        System.out.println(arrayDi.getArray().length); //3
        System.out.println(arrayDi.getArray2().length);
    }
}
