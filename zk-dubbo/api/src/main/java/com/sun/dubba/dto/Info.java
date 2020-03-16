package com.sun.dubba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zcm
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info implements Serializable {

    private Integer port;
    private String name;
}
