package com.suning.test;


import com.suning.dao.IAccountDao;
import com.suning.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:47
 * @desc
 */
public class Test02Mybatis {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    private IAccountDao accountDao;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        sqlSession = factory.openSession();
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("test");
        account.setMoney(100f);
        accountDao.save(account);
    }
    @Test
    public void testFindAll(){
        // 查询所有数据
        List<Account> list = accountDao.findAll();
        for(Account account : list){
            System.out.println(account);
        }
    }
}
