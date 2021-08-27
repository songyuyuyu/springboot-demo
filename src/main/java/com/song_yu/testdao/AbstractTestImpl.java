package com.song_yu.testdao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author:
 * @date:
 */
@Service
public class AbstractTestImpl extends AbstractTest {
    @Override
    public String getAbstract(boolean con) {
        if(con){
            return "abstract";
        }else {
            return "non-abstract";
        }
    }
}
