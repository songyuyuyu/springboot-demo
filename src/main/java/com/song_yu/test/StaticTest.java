package com.song_yu.test;

/**
 * @author:
 * @date:
 */
public class StaticTest {
    public static  String getStaticMessage(boolean con){
        if(con){
            return "static";
        }else {
            return "non-static";
        }
    }

}
