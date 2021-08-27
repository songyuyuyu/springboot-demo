package com.song_yu;

import com.song_yu.controller.HelloController;
import com.song_yu.service.Testservice;
import com.song_yu.test.StaticTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest
//������Web��Ŀ��Junit��Ҫģ��ServletContext�����������Ҫ�����ǵĲ��������@WebAppConfiguration��
@WebAppConfiguration
public class TestApplication {

    @Autowired
    HelloController helloController;

    @Autowired
    Testservice testservice;
    @Test
    public void test(){
        System.out.println(testservice.getMessage(true));
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2(){
        System.out.println(testservice.getMessage(false));
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3() {
        System.out.println(testservice.getId(true, false, false));
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test4() {
        System.out.println(testservice.getId(false, false, false));
        Assert.assertEquals(1, 1);
    }

    public void test5(){
        System.out.println(StaticTest.getStaticMessage(false));
        Assert.assertEquals(1, 1);
    }

        @Before
    public void init() {
        System.out.println("��ʼ����-----------------");
    }

    @After
    public void after() {
        System.out.println("���Խ���-----------------");
    }
}