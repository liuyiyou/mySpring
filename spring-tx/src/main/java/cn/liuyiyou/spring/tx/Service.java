package cn.liuyiyou.spring.tx;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/11
 * @version: V1.0
 */
public interface Service {

    void doNeedTx();

    void doNotNeedTx();
}
