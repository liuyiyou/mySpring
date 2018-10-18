package cn.liuyiyou.spring.ioc.demo_02;

import cn.liuyiyou.spring.demo_02.AppConfig;
import cn.liuyiyou.spring.demo_02.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/7/26
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
public class HelloWorldTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHelloWorld("Spring3 Java Config");

    }
}
