package com.song_yu.service;

import org.springframework.stereotype.Service;

/**
 * @author:
 * @date:
 */
@Service
public class Testservice implements com.song_yu.service.Service {
    @Override
    public String getMessage(boolean bigger){
        if(bigger){
            return "Hello world";
        }else {
            return "Hello Univeerse";
        }
    }

    @Override
    public int getId(boolean conA, boolean conB, boolean conC) {
        if(conA || conB || conC){
            return 1;
        }else {
            return 0;
        }
    }

}
