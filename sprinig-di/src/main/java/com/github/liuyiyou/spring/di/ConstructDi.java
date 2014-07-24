package com.github.liuyiyou.spring.di;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
public class ConstructDi implements HelloApi {

    private String message;

    private int index;
    public ConstructDi(String message,int index) {
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
