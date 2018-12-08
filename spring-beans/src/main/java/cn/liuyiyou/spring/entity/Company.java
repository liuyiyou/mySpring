package cn.liuyiyou.spring.entity;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/11/26
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
@Component
@Configuration
public class Company {

    private int id;
    private String name;
    private Map<String,String> map = new HashMap<>();
    private List<Employee> employee;
    private Set<String> sets;
    private Boolean effect;

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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Boolean getEffect() {
        return effect;
    }

    public void setEffect(Boolean effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                ", employee=" + employee +
                ", sets=" + sets +
                ", effect=" + effect +
                '}';
    }
}
