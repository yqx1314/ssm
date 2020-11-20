package com.suning.dao;

import com.suning.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:18
 * @desc
 */
@Repository("accountDao")
public interface IAccountDao {
    /**
     * 保存
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void save(Account account);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();
}
