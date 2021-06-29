package com.suning.service;

import com.suning.domain.Account;

import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:16
 * @desc
 */
public interface IAccountService {
    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();
}
