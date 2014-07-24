package com.github.liuyiyou.spring.di;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
public class StaticFactoryDi  {

    public static HelloApi newInstance(String message,int index){
        return  new ConstructDi(message,index);
    }
}
