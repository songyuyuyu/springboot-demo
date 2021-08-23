package com.song_yu;

import com.song_yu.controller.HelloController;
import com.song_yu.service.Testservice;
import org.junit.After;
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
        testservice.getMessage(true);
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