package com.sun.dubba.controller;

import com.sun.dubba.api.InfoApi;
import com.sun.dubba.api.UserApi;
import com.sun.dubba.dto.Info;
import com.sun.dubba.dto.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zcm
 */
@RestController
public class UserController {

    /**
     * 注解下面有很多配置，版本，轮训方式等
     */
    @Reference(version = "1.0")
    UserApi userApi;

    @Reference(version = "1.0")
    InfoApi infoApi;

    @GetMapping("/list")
    public List<User> list(){
        return userApi.findUserList();
    }

    @GetMapping("/info")
    public Info info(){
        return infoApi.getInfo();
    }

}
