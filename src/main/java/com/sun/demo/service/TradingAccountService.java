package com.sun.demo.service;

import com.sun.demo.entity.TradingAccount;

import java.util.List;

public interface TradingAccountService {

    public TradingAccount create(TradingAccount account);

    public TradingAccount getById(Long id);

    List<TradingAccount> getByAccountName(String accountName);
}
