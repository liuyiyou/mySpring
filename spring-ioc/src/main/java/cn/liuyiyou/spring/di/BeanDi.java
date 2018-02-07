package cn.liuyiyou.spring.di;


public class BeanDi implements HelloApi {

    private HelloApi helloApi;

    //通过构造器注入省略


    public HelloApi getHelloApi() {
        return helloApi;
    }

    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    @Override
    public void sayHello() {
        System.out.println("在原来的基础上加强一下，算是装饰");
        helloApi.sayHello();
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
