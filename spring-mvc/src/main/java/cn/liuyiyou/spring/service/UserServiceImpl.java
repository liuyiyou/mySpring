package cn.liuyiyou.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/26
 * @version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
