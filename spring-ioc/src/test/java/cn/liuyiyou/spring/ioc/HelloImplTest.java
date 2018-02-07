package cn.liuyiyou.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 001：最简单的ioc实例
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public class HelloImplTest {
    @Test
    public void testSayHello() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");

        //通过id
        HelloApi helloApi = context.getBean("hello",HelloApi.class);

        helloApi.sayHello();

        //通过全限定类名 ,注意，在该种情况下，需要该类型唯一
        //helloApi = context.getBean(HelloImpl.class);

//        helloApi.sayHello();

        //通过name
        helloApi = context.getBean("helloName",HelloApi.class);

        helloApi.sayHello();

        //通过别名
        helloApi = context.getBean("hello2",HelloApi.class);

        helloApi.sayHello();
    }
}
