package cn.liuyiyou.spring.ioc;

/**
 * 003:通过实例化工厂实例化bean
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 上午11:33
 * To change this template use File | Settings | File Templates.
 */
public class InstanceByFactory {

    public HelloApi newInstance(String message){
        return new InstanceByConstruct(message);
    }
}
