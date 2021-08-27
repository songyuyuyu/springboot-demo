package com.song_yu.dao;

import org.springframework.stereotype.Service;

/**
 * @author:
 * @date:
 */
@Service
public class AbstractDemoImpl extends AbstractDemo {
    @Override
    public String getAbstract(boolean con) {
        if(con){
            return "abstract";
        }else {
            return "non-abstract";
        }
    }
}
