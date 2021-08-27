package com.song_yu.dao;

/**
 * @author:
 * @date:
 */
public class StaticDemo {
    public static  String getStaticMessage(boolean con){
        if(con){
            return "static";
        }else {
            return "non-static";
        }
    }

}
