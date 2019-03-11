package cn.liuyiyou.spring.jdbc;

import cn.liuyiyou.spring.jdbc.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Before
    public void setUp() {
        String createTableSql = "CREATE  TABLE test (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100))";
        jdbcTemplate.update(createTableSql);
    }


    @Test
    public void testCURD() {
        insert();
        delete();
        update();
        select();
    }

    public void insert() {
        String insertSql = "INSERT INTO test(name) VALUES ('name1')";
        String insertSql2 = "INSERT INTO test(name) VALUES ('name2')";
        jdbcTemplate.update(insertSql);
        jdbcTemplate.update(insertSql2);
        String selectSql = "SELECT count(*) FROM test";
        int result = jdbcTemplate.queryForObject(selectSql, Integer.class);
        Assert.assertEquals(2, result);
    }

    public void delete() {
        String deleteSql = "DELETE FROM test WHERE name = ?";
        jdbcTemplate.update(deleteSql, new Object[]{"name2"});
        String selectSql = "SELECT count(*) FROM test";
        int result = jdbcTemplate.queryForObject(selectSql, Integer.class);
        Assert.assertEquals(1, result);
    }

    public void update() {
        String updateSql = "UPDATE test SET name = 'name3' WHERE name = ? ";
        String selectSql = "SELECT count(*) FROM test WHERE name = 'name3'";
        jdbcTemplate.update(updateSql, new Object[]{"name1"});
        int result = jdbcTemplate.queryForObject(selectSql, Integer.class);
        Assert.assertEquals(1, result);

    }

    public void select() {
        String selectSql = "SELECT * FROM test ";
        jdbcTemplate.query(selectSql, resultSet -> {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
        });
        List<User> users = jdbcTemplate.queryForList(selectSql, User.class);
        System.out.println(users.size());
    }
}
