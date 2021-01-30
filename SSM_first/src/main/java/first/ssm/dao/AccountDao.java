package first.ssm.dao;

import first.ssm.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();
    void save(Account account);
    Account findById(Integer id);
    void update(Account account);
    void delete(Integer id);
    void deleteBatch(Integer[] ids);
}
