package cn.liuyiyou.spring.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-24
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class MapDiTest {

    @Test
    public void testMapDi() {
        BeanFactory factory = new ClassPathXmlApplicationContext("mapDi.xml");
        MapDi mapDi = factory.getBean("mapDi", MapDi.class);
        Map<String, String> maps = mapDi.getValues();
        Set<String> keySet = maps.keySet();
        for (String key : keySet) {
            //循环取出了你map里面的值然后再调用你的sql方法想怎么存就怎么存
            System.out.println(key + " = " + maps.get(key));
        }
    }
}
