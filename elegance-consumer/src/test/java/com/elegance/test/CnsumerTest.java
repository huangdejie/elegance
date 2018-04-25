package com.elegance.test;

import com.elegance.consumer.DubboConsumerServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/24 0024.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml","classpath*:spring-dubbo.xml"})
public class CnsumerTest {
    @Resource
    DubboConsumerServiceI dubboConsumerService;
    @Test
    public void testa(){
        System.out.println(dubboConsumerService.getName());
    }
}
