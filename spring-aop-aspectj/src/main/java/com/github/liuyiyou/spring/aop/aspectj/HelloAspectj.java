package com.github.liuyiyou.spring.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:27
 * To change this template use File | Settings | File Templates.
 */

@Aspect
public class HelloAspectj {

    @Before(value = "execution(* com.github.liuyiyou..*.sayHello(..)) && args(param)")
    public void before(String param){
        System.out.println("====before : and param=" + param);
    }

    @After(value = "execution(* com.github.liuyiyou..*.sayHello(..)) && args(param)")
    public void afterfinaly(String param){
        System.out.println("====after :and param="+param);
    }
}
