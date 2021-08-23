package com.song_yu.service;

import org.springframework.stereotype.Service;

/**
 * @author:
 * @date:
 */
@Service
public class Testservice {
    public String getMessage(boolean bigger){
        if(bigger){
            return "Hello world";
        }else {
            return "Hello Univeerse";
        }
    }

}
