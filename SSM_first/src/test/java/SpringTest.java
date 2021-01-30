import first.ssm.model.Account;
import first.ssm.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testService(){
        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
