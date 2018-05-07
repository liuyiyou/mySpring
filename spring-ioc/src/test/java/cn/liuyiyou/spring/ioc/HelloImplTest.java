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

    @Autowired
    private HelloApi helloApi;

    @Test
    public void test() throws Exception {
        helloApi.sayHello();
    }


}
