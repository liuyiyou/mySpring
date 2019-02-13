package cn.liuyiyou.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: liuyiyou.cn
 * @date: 2019/2/13
 * @version: V1.0
 */
@Component
public class UserService {

    @Autowired
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
