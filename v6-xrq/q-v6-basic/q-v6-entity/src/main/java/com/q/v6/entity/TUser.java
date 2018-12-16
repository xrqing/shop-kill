package com.q.v6.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class TUser implements Serializable{
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Boolean activate;
    private Integer score;
    private Date createTime;
    private Date updateTime;
    private Long createUser;
    private Long updateUser;
    private Boolean flag;
}