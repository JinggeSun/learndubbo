package com.sun.dubba.api;

import com.sun.dubba.dto.User;

import java.util.List;

/**
 * 公共的接口
 * @author zcm
 */
public interface UserApi {

    /**
     * 获取所有用户列表
     */
    List<User> findUserList();
}
