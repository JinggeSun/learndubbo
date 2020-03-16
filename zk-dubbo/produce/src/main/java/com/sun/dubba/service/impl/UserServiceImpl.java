package com.sun.dubba.service.impl;

import com.sun.dubba.api.UserApi;
import com.sun.dubba.dto.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zcm
 */
@Service(version = "1.0")
public class UserServiceImpl implements UserApi {

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("zhangsan","123456789","北京"));
        userList.add(new User("lisi","1234433239","济南"));
    }

    @Override
    public List<User> findUserList() {
        return userList;
    }
}
