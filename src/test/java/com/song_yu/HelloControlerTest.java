package com.song_yu;

import com.song_yu.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:
 * @date:
 */
public class HelloControlerTest {
    @Autowired
    HelloController helloController;

    @Test
    public void test(){
        helloController.hello();

//        Assert.assertSame("Hello, SpringBoot", helloController.hello());
    }
}
