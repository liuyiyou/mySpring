package cn.liuyiyou.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello2";
    }

}
