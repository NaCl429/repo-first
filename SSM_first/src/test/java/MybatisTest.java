import first.ssm.dao.AccountDao;
import first.ssm.model.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis(){
        try {
            InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountDao mapper = sqlSession.getMapper(AccountDao.class);
            List<Account> accountList = mapper.findAll();
            System.out.println(resource.getClass());
            for (Account account : accountList) {
                System.out.println(account);
            }
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
