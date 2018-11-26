package cn.liuyiyou.spring.ioc.aspectj;

import cn.liuyiyou.spring.ioc.aspectj.annotation.QPS;
import cn.liuyiyou.spring.ioc.aspectj.annotation.RT;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:34
 * To change this template use File | Settings | File Templates.
 */
public class HelloServiceImpl implements HelloService {
    @Override

    @RT
    public void sayHello(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(3424L);
    }
}
