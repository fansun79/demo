package com.sun.demo;

import com.sun.demo.entity.TradingAccount;
import com.sun.demo.entity.enumeration.DataSource;
import com.sun.demo.service.TradingAccountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private TradingAccountService service;

    @Test
    public void test() {

        TradingAccount  account = new TradingAccount();
        account.setName("1818");
        account.setPassword("password");
        account.setDataSource(DataSource.FXALL);

        TradingAccount r = this.service.create(account);
        System.out.println(r.getId());

        TradingAccount r1 = this.service.getById(r.getId());

        Assert.assertEquals(r.getName(),r1.getName());
    }

}
