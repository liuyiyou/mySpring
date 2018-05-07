package cn.liuyiyou.spring.ioc;


/**
 * 通过构造函数注入
 */
public class InstanceByConstruct implements HelloApi {

    private String message;

    public InstanceByConstruct() {
       this("Hello World");
    }

    public InstanceByConstruct(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println("By Construct");
        System.out.println(message);

    }
}
