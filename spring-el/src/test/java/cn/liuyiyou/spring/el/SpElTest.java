package cn.liuyiyou.spring.el;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class SpElTest {

    @Test
    public void test(){

        ExpressionParser parser = new SpelExpressionParser();
        //contact是String中的方法
        Expression expression = parser.parseExpression("('Hello' + ' World').concat(#end)");
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("end","!");
        Assert.assertEquals("Hello World!",expression.getValue(context));
    }


    @Test
    public void testXmlExpression(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("el.xml");
        String hello1 = ctx.getBean("hello1",String.class);
        String hello2 = ctx.getBean("hello2",String.class);
        String hello3 = ctx.getBean("hello3",String.class);
        Assert.assertEquals("Hello World!",hello1);
        Assert.assertEquals("Hello World!",hello2);
        Assert.assertEquals("Hello World!",hello3);

    }
}
