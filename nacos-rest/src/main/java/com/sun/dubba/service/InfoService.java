package com.sun.dubba.service;

import com.sun.dubba.dto.Info;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/info")
public interface InfoService {

    /**
     * 获取信息
     * @return
     */
    @GET
    @Path("/getInfo")
    @Consumes({MediaType.APPLICATION_JSON})
    String getInfo();
}
