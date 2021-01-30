package first.ssm.controller;

import first.ssm.model.Account;
import first.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.save(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/findById")
    public String findById(Integer id,Model model){
        Account account = accountService.findById(id);
        model.addAttribute(account);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Account account){
        accountService.update(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        accountService.delete(id);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/deleteBatch")
    public String delete(Integer[] ids){
        accountService.deleteBatch(ids);
        return "redirect:/account/findAll";
    }

}
