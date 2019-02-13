package cn.liuyiyou.spring;

import cn.liuyiyou.spring.entity.Company;
import cn.liuyiyou.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author: liuyiyou.cn
 * @date: 2018/11/26
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
public class InjectTest {

    @Test
    public void test3(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.getAccountService());
    }


    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.refresh();
        final Company company = ctx.getBean(Company.class);
        System.out.println(company);
        System.out.println(Runtime.getRuntime().totalMemory());
    }


    @Test
    public void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.getAccountService());
    }


}
