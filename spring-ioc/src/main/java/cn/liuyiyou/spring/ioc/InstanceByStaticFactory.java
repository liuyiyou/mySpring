package cn.liuyiyou.spring.ioc;

/**
 * 通过静态工厂
 */
public class InstanceByStaticFactory {

    public static HelloApi newInstance(String message) {
        return new InstanceByConstruct(message);
    }
}
