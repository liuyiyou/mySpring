package cn.liuyiyou.spring.ioc;

/**
 * 使用set注入
 */
public class SetterDi implements HelloApi {

    public String message;

    public int index;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println("使用set注入");
        System.out.println(index + ":" + message);
    }
}
