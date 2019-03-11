package cn.liuyiyou.spring.tx;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/11
 * @version: V1.0
 */
public class ServiceImpl implements Service {

    @Transactional
    @Override
    public void doNeedTx() {
        System.out.println("execute doNeedTx in ServiceImpl");
    }

    @Override
    public void doNotNeedTx() {
        this.doNeedTx();
    }

}
