package cn.liuyiyou.spring;

import cn.liuyiyou.spring.context.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class PropertySourceTest {

    @Test
    public void test() {
        System.out.println("xx");
    }
}
