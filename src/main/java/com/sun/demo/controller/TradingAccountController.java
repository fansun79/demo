package com.sun.demo.controller;

import com.sun.demo.controller.req.CreateTradingAccountReq;
import com.sun.demo.entity.TradingAccount;
import com.sun.demo.service.TradingAccountService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "AdminUserController ")
@RestController
@RequestMapping("/trading_account")
public class TradingAccountController {

    @Autowired
    private TradingAccountService service;

    @ApiOperation(value = "创建交易账号")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TradingAccount.class),
            @ApiResponse(code = 500, message = "Failed", response = Exception.class)})
    @PostMapping("/create")
    public TradingAccount create(CreateTradingAccountReq req) {


        TradingAccount account = new TradingAccount();
        account.setDataSource(req.getDataSource());
        account.setName(req.getName());
        account.setPassword(req.getPassword());

        return this.service.create(account);
    }

}
