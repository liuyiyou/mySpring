package cn.liuyiyou.spring.aop;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:02
 * To change this template use File | Settings | File Templates.
 */
//003:定义切面支持类 ,缺少切入点的切面
public class HelloAspect {

    //前置通知
    public void beforeAdvice(){
        System.out.println("=======before advice");
    }

    //后置最终通知
    public void afterFinallyAdivce(){
        System.out.println("=======after finally advice");
    }
}
