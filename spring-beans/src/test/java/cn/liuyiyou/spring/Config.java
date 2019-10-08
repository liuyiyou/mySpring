package cn.liuyiyou.spring;

import cn.liuyiyou.spring.entity.Company;
import cn.liuyiyou.spring.entity.Employee;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: liuyiyou.cn
 * @date: 2018/11/26
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
@Configuration
public class Config {
    @Bean
    public Company company(){
        Company company = new Company();
        company.setEffect(true);
        company.setId(1);
        Map<String,String> map = new HashMap<>();
        map.put("1","aaaa");
        company.setMap(map);
        company.setName("name");
        company.setSets(Sets.newHashSet("1","2","3"));
        List<Employee> employees = Lists.newArrayList();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("aaa"+1);
        employees.add(employee);
        employee = new Employee();
        employee.setId(21);
        employee.setName("aaa"+21);
        employees.add(employee);
        company.setEmployee(employees);
        return company;
    }
}
