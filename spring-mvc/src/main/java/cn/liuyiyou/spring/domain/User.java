//package cn.liuyiyou.spring.domain;
//
//
//import javax.validation.constraints.Size;
//
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;
//
///**
// * Created with IntelliJ IDEA.
// * User: liuyiyou
// * Date: 14-7-15
// * Time: 下午9:07
// * To change this template use File | Settings | File Templates.
// */
//public class User {
//
//    @NotEmpty(message = "姓名不能为空")
//    private String username;
//
//    private String nickname;
//
//    @Size(min = 3, max = 10, message = "密码长度必须大于3小于10")
//    private String password;
//
//    @NotEmpty(message = "邮箱不能为空")
//    @Email(message = "邮箱格式不正确")
//    // 也可通过@Pattern(regexp="")书写正则来判断，二者都是JSR303规范中的
//    private String email;
//
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public String getNickname() {
//        return nickname;
//    }
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//}
