package com.sun.demo.entity;

import com.sun.demo.entity.enumeration.DataSource;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 账户主键
 */
@Entity
@Table(name="T_TRADING_ACCOUNT")
@Data
public class TradingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",nullable = false)
    private Long id;  //数据库主键

    @Column(name="ACCOUNT_NAME",nullable = false)
    private String name; //账户名称

    @Column(name="PASSWORD",nullable = false)
    private String password; //账户密码

    @Enumerated(EnumType.STRING)
    @Column(name="DATASOURCE")
    private DataSource dataSource;

}
