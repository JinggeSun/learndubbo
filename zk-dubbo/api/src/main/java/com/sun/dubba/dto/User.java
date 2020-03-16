package com.sun.dubba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息
 * @author zcm
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String userName;
    private String phone;
    private String addr;
}
