package cn.liuyiyou.spring.ioc;

/**
 * 002:bean 的实例化
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByConstruct implements HelloApi {

    private String message;

    public InstanceByConstruct() {
        this.message = "Hello World";
    }

    public InstanceByConstruct(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println(message);

    }
}
