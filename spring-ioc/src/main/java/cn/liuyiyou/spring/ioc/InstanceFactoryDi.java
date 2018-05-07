package cn.liuyiyou.spring.ioc;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:47
 * To change this template use File | Settings | File Templates.
 */
public class InstanceFactoryDi {

    public HelloApi newInstance(String message,int index){
        return new ConstructDi(message,index);
    }
}
