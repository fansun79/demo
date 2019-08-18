package com.sun.demo.service.impl;


import com.sun.demo.dao.TradingAccountDao;
import com.sun.demo.entity.TradingAccount;
import com.sun.demo.service.TradingAccountService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TradingAccountServiceImpl implements TradingAccountService {

    @Resource
    private TradingAccountDao dao;


    @Override
    public TradingAccount create(TradingAccount account) {
        return this.dao.save(account);
    }

    @Override
    public TradingAccount getById(Long id) {

        return this.dao.findById(id).get();
    }

    @Override
    public List<TradingAccount> getByAccountName(String accountName)
    {

        return this.dao.findByName(accountName);
    }
}
