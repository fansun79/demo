package com.sun.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@IdClass(RoleUser.class)
@Table(name="T_ROLE_USER")
public class RoleUser implements Serializable {

    @Id
    @Column(name="USER_ID")
    private Long userId;

    @Id
    @Column(name="ROLE_ID")
    private Long roleId;
}
