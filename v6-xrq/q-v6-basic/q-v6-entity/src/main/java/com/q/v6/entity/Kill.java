package com.q.v6.entity;

/*
@auther XiaoRuiQing
@Date 2018/12/8
*/

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Kill implements Serializable {
    private Integer id;
    private String title;
    private String image;
    private double price;
    private Integer save;
    private Date starttime;
    private Date endtime;
    private Integer statu;
    private Integer version;
}
