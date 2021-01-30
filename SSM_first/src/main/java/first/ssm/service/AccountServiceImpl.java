package first.ssm.service;

import first.ssm.dao.AccountDao;
import first.ssm.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        accountDao.deleteBatch(ids);
    }
}
