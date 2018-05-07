package cn.liuyiyou.spring.ioc;

/**
 * 003:通过实例化工厂实例化bean
 */
public class InstanceByFactory {

    public HelloApi newInstance(String message) {
        return new InstanceByConstruct(message);
    }
}
