package first.ssm.controller;

import first.ssm.model.Account;
import first.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {


    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/findAll-old")
    public String findAll2(Model model) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(1,"张三",1000d));
        list.add(new Account(2,"李四",1000d));
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
