package cn.liuyiyou.spring.tx;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/11
 * @version: V1.0
 */
public class ProxyByJdkDynamic implements Service {

    //包含目标对象
    private Service taget;

    public ProxyByJdkDynamic(Service service) {
        this.taget = service;
    }

    //目标对象包含特殊方法，需要特殊处理
    @Override
    public void doNeedTx() {
        System.out.println("create transaction in proxy");
        taget.doNeedTx();
        System.out.println("commit tx in proxy");
    }

    @Override
    public void doNotNeedTx() {
        taget.doNotNeedTx();
    }
}
