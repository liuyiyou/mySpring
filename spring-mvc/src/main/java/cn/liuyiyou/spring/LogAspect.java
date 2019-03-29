//package cn.liuyiyou.spring;
//
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.stereotype.Component;
//
////@EnableAspectJAutoProxy
//@Aspect
//@Component
//public class LogAspect {
//
//    //    @Before(value = "execution(* cn.liuyiyou.spring.web..*(..)) && args(param)")
////    public void before(String param) {
////        System.out.println("====before : and param=" + param);
////    }
////
////    @After(value = "execution(* cn.liuyiyou.spring.web..*(..)) && args(param)")
////    public void afterfinaly(String param) {
////        System.out.println("====after :and param=" + param);
////    }
//    @AfterThrowing(value = "execution(* cn.liuyiyou.spring.web..*(..))", throwing = "ex")
//    public void excepton(RuntimeException ex) {
//        System.out.println("xxxx");
//        ex.printStackTrace();
//    }
//}
