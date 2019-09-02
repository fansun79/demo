package com.sun.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="T_ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id; //数据库主键

    @Column(name="NAME",unique = true, nullable = false)
    private String name;//角色名称


    @Column(name="REMARK")
    private String remark;//备注


}
