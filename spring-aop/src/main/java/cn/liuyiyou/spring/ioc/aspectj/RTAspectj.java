package cn.liuyiyou.spring.ioc.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class RTAspectj {

    @Around("@annotation(cn.liuyiyou.spring.ioc.aspectj.annotation.RT)")
    public void before(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("start::");
        long start = System.currentTimeMillis();
        pjp.proceed();
        System.out.println("end");
        long end = System.currentTimeMillis();
        System.out.println((end - start));

    }
}
