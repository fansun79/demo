package com.sun.demo.dao;

import com.sun.demo.entity.TradingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradingAccountDao extends JpaRepository<TradingAccount,Long> {


    public List<TradingAccount> findByName(String name);




}
