package com.song_yu.testdao;

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
