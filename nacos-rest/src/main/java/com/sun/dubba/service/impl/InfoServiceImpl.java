package com.sun.dubba.service.impl;

import com.alibaba.fastjson.JSON;
import com.sun.dubba.dto.Info;
import com.sun.dubba.service.InfoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zcm
 */
@Service
public class InfoServiceImpl implements InfoService {

    @Value("${server.port}")
    private Integer port;

    @Value("${dubbo.application.name}")
    private String name;


    @Override
        public String getInfo() {
        return JSON.toJSONString(new Info(port,name));
    }
}
