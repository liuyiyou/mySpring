//package cn.liuyiyou.spring.web;
//
//import com.github.liuyiyou.spring.domain.User;
//import com.github.liuyiyou.spring.domain.UserValidator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.validation.Valid;
//
///**
// * Created with IntelliJ IDEA.
// * User: liuyiyou
// * Date: 14-7-15
// * Time: 下午9:34
// * To change this template use File | Settings | File Templates.
// */
//@Controller
//@RequestMapping(value = "validator")
//public class ValidatorController {
//
//    @Autowired
//    private UserValidator userValidator;
//
//    @RequestMapping(value = "/index")
//    public String index() {
//        return "validator/index";
//    }
//
//
//    /**
//     * 第一种，使用spring自带的validator
//     */
//
//    @RequestMapping(value = "validator1")
//    public String validator1(@ModelAttribute("user") User user,
//                             BindingResult result) {
//        userValidator.validate(user, result);
//        if (result.hasErrors()) {
//            return "register";
//        }
//        return "/validator/validator1";
//    }
//
//    /**
//     * 第二种：基于注解
//     */
//
//    @RequestMapping(value = "validator2")
//    public String validator2(@Valid @ModelAttribute("user") User user, BindingResult result) {
//
//        return "/validator/validator2";
//    }
//}
