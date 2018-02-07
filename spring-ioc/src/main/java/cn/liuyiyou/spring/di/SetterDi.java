package cn.liuyiyou.spring.di;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午3:52
 * To change this template use File | Settings | File Templates.
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
        System.out.println(index + ":" + message);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
