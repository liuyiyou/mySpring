package cn.liuyiyou.spring.ioc;


public class BeanDi implements HelloApi {

    private HelloApi helloApi;


    public HelloApi getHelloApi() {
        return helloApi;
    }

    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    @Override
    public void sayHello() {
        System.out.println("BeanDI");
        helloApi.sayHello();
    }
}
