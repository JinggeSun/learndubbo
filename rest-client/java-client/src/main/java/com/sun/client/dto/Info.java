package com.sun.client.dto;

/**
 * @author zcm
 */
public class Info {

    private Integer port;
    private String name;

    public Info(){

    }

    public Info(Integer port, String name) {
        this.port = port;
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
