package cn.liuyiyou.spring.ioc;

public class ConstructDi implements HelloApi {

    private String message;

    private int index;
    public ConstructDi(String message,int index) {
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println("Construct DI");
        System.out.println(index + ":" + message);
    }
}
