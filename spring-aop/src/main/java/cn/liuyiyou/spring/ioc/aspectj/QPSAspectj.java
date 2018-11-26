package cn.liuyiyou.spring.ioc.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QPSAspectj {

    //    @Around(value = "execution()")
    @Around("@annotation(cn.liuyiyou.spring.ioc.aspectj.annotation.QPS)")
    public void before(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("start::");
        long start = System.currentTimeMillis();
        pjp.proceed();
        System.out.println("end");
        long end = System.currentTimeMillis();
        System.out.println((end - start));

    }
}
