package com.suning.service.impl;

import com.suning.dao.IAccountDao;
import com.suning.domain.Account;
import com.suning.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:16
 * @desc
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public void saveAccount(Account account) {
        accountDao.save(account);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAll();
    }
}
