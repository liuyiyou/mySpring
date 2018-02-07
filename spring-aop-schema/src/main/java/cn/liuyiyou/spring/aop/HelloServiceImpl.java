package cn.liuyiyou.spring.aop;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:01
 * To change this template use File | Settings | File Templates.
 */
//002:定义目标接口实现
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
