package cn.liuyiyou.spring.ioc.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class HelloAspectj {

    @Before(value = "execution(* cn.liuyiyou..*(..)) && args(param)")
    public void before(String param) {
        System.out.println("====before : and param=" + param);
    }

    @After(value = "execution(* cn.liuyiyou..*(..)) && args(param)")
    public void afterfinaly(String param) {
        System.out.println("====after :and param=" + param);
    }
    @AfterThrowing(value = "execution(* cn.liuyiyou..*(..))", throwing = "ex")
    public void excepton(RuntimeException ex){
        System.out.println("xxxx");
        ex.printStackTrace();
    }
}
