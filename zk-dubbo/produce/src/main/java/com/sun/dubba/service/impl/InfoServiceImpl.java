package com.sun.dubba.service.impl;

import com.sun.dubba.api.InfoApi;
import com.sun.dubba.dto.Info;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zcm
 */
@Service(version = "1.0")
public class InfoServiceImpl implements InfoApi {

    @Value("${server.port}")
    private Integer port;

    @Value("${dubbo.application.name}")
    private String name;

    @Override
    public Info getInfo() {
        return new Info(port,name);
    }
}
