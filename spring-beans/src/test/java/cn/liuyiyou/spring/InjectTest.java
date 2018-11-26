package cn.liuyiyou.spring;

import cn.liuyiyou.spring.entity.Company;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/11/26
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
public class InjectTest {

   

    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        final Company company = ctx.getBean(Company.class);
        System.out.println(company);
    }

}
