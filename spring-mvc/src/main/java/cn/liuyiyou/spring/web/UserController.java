package cn.liuyiyou.spring.web;

import cn.liuyiyou.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "xxx",required = false)String xxx) {
        xxx.substring(1,1);
        userService.sayHello();
        return "hello2";
    }

}
