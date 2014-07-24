package com.github.liuyiyou.spring.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-16
 * Time: 上午10:18
 * To change this template use File | Settings | File Templates.
 */
public class ValidatorControllerTest{


    //这个在3.2.0及以上版本才有，之前是没有的
    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new ValidatorController()).alwaysExpect(MockMvcResultMatchers.status().isOk()).build();
    }

    @Test
    public void testIndex() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/validator/index")).andExpect(MockMvcResultMatchers.forwardedUrl("validator/index"));

    }

    @Test
    public void testValidator1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate?number=3&date=2029-07-04"))
                .andExpect(MockMvcResultMatchers.content().string("No errors"));
    }

    @Test
    public void testValidator2() throws Exception {

    }
}
