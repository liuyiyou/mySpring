package cn.liuyiyou.spring.strategy;

import org.springframework.stereotype.Component;

/**
 * @author: liuyiyou.cn
 * @date: 2018/10/18
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */

@Component("write")
public class WriteStrategy implements Strategy {
    @Override
    public String action() {
        return "写字！！！";
    }
}