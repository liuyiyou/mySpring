package cn.liuyiyou.spring.ioc.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HelloAspectj {

    @Before(value = "execution(* cn.liuyiyou..*.sayHello(..)) && args(param)")
    public void before(String param) {
        System.out.println("====before : and param=" + param);
    }

    @After(value = "execution(* cn.liuyiyou..*.sayHello(..)) && args(param)")
    public void afterfinaly(String param) {
        System.out.println("====after :and param=" + param);
    }
}
