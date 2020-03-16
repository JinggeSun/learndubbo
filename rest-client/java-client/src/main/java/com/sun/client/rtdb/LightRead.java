package com.sun.client.rtdb;

import com.alibaba.fastjson.JSON;
import com.sun.client.dto.Info;
import com.sun.client.util.HttpUtil;

public class LightRead {

    public static String URL = "http://localhost:8888/restApi/";

    public static Info findInfo(){

        try {
           String res =  HttpUtil.get(URL+"info/getInfo");
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
