package cn.liuyiyou.spring.demo_01;

/**
 * @author: liuyiyou.cn
 * @date: 2018/7/26
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
