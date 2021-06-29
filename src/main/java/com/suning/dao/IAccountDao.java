package com.suning.dao;

import com.suning.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yqx
 * @create  2020/11/20 15:18
 * @Desc
 */
@Repository("accountDao")
public interface IAccountDao {
    /**
     * 保存
     * @param account 要保存的账户
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void save(Account account);

    /**
     * 查询所有
     * @return 返回所有账户
     */
    @Select("select * from account")
    List<Account> findAll();
}
