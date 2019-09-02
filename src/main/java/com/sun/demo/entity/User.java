package com.sun.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="T_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id; //数据库主键

    @Column(name="ACCOUNT_ID",unique = true,nullable = false)
    private String accountID; //业务主键

    @Column(name="NAME",nullable = false)
    private String name; //用户名称

    @Column(name="PASSWORD")
    private String password; //登录密码



}
