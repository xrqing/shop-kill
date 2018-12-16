package com.q.v6.entity;/*
@auther XiaoRuiQing
@Date 2018/12/8
*/


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Orders {
    private Integer id;
    private String orderid;
    private Integer uid;
    private String person;
    private String address;
    private String phone;
    private Integer code;
    private Double oprice;
    private Integer status;
    private Date ordertime;
}
