package com.github.liuyiyou.spring.di;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:17
 * To change this template use File | Settings | File Templates.
 */
public class MapDi {

    private Map<String,String> values;

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
