//package cn.liuyiyou.spring.service;
//
//import com.github.liuyiyou.spring.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementSetter;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// * Created with IntelliJ IDEA.
// * User: liuyiyou
// * Date: 14-7-15
// * Time: 下午9:12
// * To change this template use File | Settings | File Templates.
// */
//@Service
//@Transactional
//public class UserService {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public int addUser(final User user) throws RuntimeException {
//        int result = 0;
//        System.out.println("事务开始");
//        try {
//            result = jdbcTemplate.update(
//                    "INSERT INTO T_USER(user_name,password) VALUES(?, ?)",
//                    new PreparedStatementSetter() {
//                        public void setValues(PreparedStatement ps)
//                                throws SQLException {
//                            ps.setString(1, user.getUsername());
//                            ps.setString(2, user.getPassword());
//                        }
//                    });
//
//            System.out.println("这里应该提交");
//            throw new RuntimeException("sdfdsfsdf");
//        } catch (RuntimeException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            result = 2;
//        }
//
//        return result;
//    }
//}
