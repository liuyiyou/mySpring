package cn.liuyiyou.spring.ioc.aspectj;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:34
 * To change this template use File | Settings | File Templates.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String message) {
        System.out.println(message);
    }
}
