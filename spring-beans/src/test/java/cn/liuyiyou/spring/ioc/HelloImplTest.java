package cn.liuyiyou.spring.ioc;

import cn.liuyiyou.spring.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class HelloImplTest {
    @Test
    public void testSayHello() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
        //通过id
        HelloApi helloApi = context.getBean("hello", HelloApi.class);
        helloApi.sayHello();
        //通过全限定类名 ,注意，在该种情况下，需要该类型唯一
        //helloApi = context.getBean(HelloImpl.class);
//        helloApi.sayHello();
        //通过name
        helloApi = context.getBean("helloName", HelloApi.class);
        helloApi.sayHello();
        //通过别名
        helloApi = context.getBean("hello2", HelloApi.class);
        helloApi.sayHello();
    }

    @Autowired
    private HelloApi helloApi;

    @Test
    public void test() throws Exception {
        helloApi.sayHello();
    }
}
