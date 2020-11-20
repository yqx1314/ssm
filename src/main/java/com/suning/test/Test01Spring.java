package com.suning.test;

import com.suning.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:25
 * @desc 测试spring能否独立运行
 */
public class Test01Spring {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.findAllAccount();
    }
}
