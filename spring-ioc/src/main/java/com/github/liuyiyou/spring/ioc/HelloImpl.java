package com.github.liuyiyou.spring.ioc;

/**
 * 001：最简单的ioc实例
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午10:40
 * To change this template use File | Settings | File Templates.
 */
public class HelloImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.print("Hello ");
    }
}
