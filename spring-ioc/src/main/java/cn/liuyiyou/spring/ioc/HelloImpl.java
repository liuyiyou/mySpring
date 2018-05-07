package cn.liuyiyou.spring.ioc;


/**
 * 接口实现
 */
public class HelloImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.print("Hello ：  HelloImpl");
    }
}
