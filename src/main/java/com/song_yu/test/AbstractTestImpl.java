package com.song_yu.test;

/**
 * @author:
 * @date:
 */
public class AbstractTestImpl extends AbstractTest{
    @Override
    public String getAbstract(boolean con) {
        if(con){
            return "abstract";
        }else {
            return "non-abstract";
        }
    }
}
