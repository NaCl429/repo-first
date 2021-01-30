package first.ssm.service;

import first.ssm.model.Account;
import org.springframework.ui.Model;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
    void save(Account account);
    Account findById(Integer id);
    void update(Account account);
    void delete(Integer id);
    void deleteBatch(Integer[] ids);


}
