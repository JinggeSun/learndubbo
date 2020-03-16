package com.sun.dubba.dto;

import java.io.Serializable;

/**
 * @author zcm
 */
public class Info implements Serializable {

    private Integer port;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

    public String getName() {
        return name;
    }

    public Info(Integer port, String name) {
        this.port = port;
        this.name = name;
    }
}
