package com.suning.controller;

import com.suning.domain.Account;
import com.suning.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2020/11/20 15:32
 * @desc
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAllAccount")
    public ModelAndView findAllAccount(){
        List<Account> accounts = accountService.findAllAccount();
        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts",accounts);
        mv.setViewName("list");
        return mv;
    }
    @RequestMapping("/save")
    public String save(Account account){
        accountService.saveAccount(account);
        return "redirect:findAllAccount";
    }
}
