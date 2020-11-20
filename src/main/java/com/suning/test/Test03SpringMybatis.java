package com.suning.test;

import com.suning.domain.Account;
import com.suning.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 16:20
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test03SpringMybatis {
    @Autowired
    private IAccountService accountService;
    @Test
    public void testFindAll(){
        List<Account> accounts = accountService.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }
    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("test1");
        account.setMoney(200f);
        accountService.saveAccount(account);
    }
}
