package cn.liuyiyou.spring.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/10/18
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
@Component
public class ContextSpringFactory {
    @Autowired
    private Map<String, Strategy> stgMap;

    public String doAction(String strType) {
        Strategy strategy = this.stgMap.get(strType);
        return strategy.action();
    }
}