package cn.liuyiyou.spring.demo_02;

/**
 * @author: liuyiyou.cn
 * @date: 2018/7/26
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}
