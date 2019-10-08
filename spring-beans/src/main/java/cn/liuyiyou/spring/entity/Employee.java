package cn.liuyiyou.spring.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuyiyou.cn
 * @date: 2018/11/26
 * @version: V1.0
 * @Copyright: 2018 liuyiyou.cn Inc. All rights reserved.
 */
public class Employee {

    private int id;
    private String name;
    private Map<String,String> map  = new HashMap();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }
}
