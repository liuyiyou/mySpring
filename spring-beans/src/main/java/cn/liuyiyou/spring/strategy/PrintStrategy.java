package cn.liuyiyou.spring.strategy;

import org.springframework.stereotype.Component;

/**
 * @author: liuyiyou.cn
 * @date: 2018/10/18
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
@Component("print")
public class PrintStrategy implements Strategy {
    @Override
    public String action() {
        return "打印！！";
    }}

