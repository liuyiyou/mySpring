package cn.liuyiyou.spring.ioc.aspectj;

import cn.liuyiyou.spring.ioc.aspectj.annotation.RT;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午12:34
 * To change this template use File | Settings | File Templates.
 */
@Service
public class HelloServiceImpl {//implements HelloService {

//    @Override
//    @RT
    public void sayHello(String message)  {
        if(message == null){
            message.substring(1,2);
        }
        System.out.println(message);

    }
}
