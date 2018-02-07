package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:09
 * To change this template use File | Settings | File Templates.
 */
public class ListDiTest {

    @Test
    public void testListDi(){
        BeanFactory factory  = new ClassPathXmlApplicationContext("listDi.xml");
        ListDi listDi = factory.getBean("listDi",ListDi.class);
        System.out.println(listDi.getValues().size());
    }
}
