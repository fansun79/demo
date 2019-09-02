package com.sun.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;

@Data
@AllArgsConstructor
public class UserVO {

    @Column(name="userName")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="roleName")
    private  String roleName;



}
