package com.github.liuyiyou.spring.domain;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:52
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User)target;
        if(StringUtils.isEmpty(user.getUsername())){
            errors.rejectValue("username","empty");
        }

        if (user.getUsername().length() < 3) {
            errors.rejectValue("username", "min");
        }

        if (user.getPassword() == null || user.getPassword() == "") {
            errors.rejectValue("password", "empty");
        }


    }
}
