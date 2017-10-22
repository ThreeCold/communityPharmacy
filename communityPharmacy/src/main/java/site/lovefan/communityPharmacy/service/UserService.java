package site.lovefan.communityPharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.lovefan.communityPharmacy.mapper.AccountMapper;
import site.lovefan.communityPharmacy.pojo.Account;
import site.lovefan.communityPharmacy.utils.CommonUtils;

import java.util.List;

/**
 * Created by girlF on 2017/10/22.
 */
@Service
public class UserService {
    @Autowired
    private AccountMapper accountMapper;

    public boolean login(String email, String password) {
        List<Account> accountList = selectByEmail(email);
        if (accountList == null || accountList.size() == 0) {
            return false;
        } else {
            Account account = accountList.get(0);
            String passwordSalt = account.getPasswordSalt();
            String md5Password = CommonUtils.calcMD5(password + passwordSalt);
            if (!md5Password.equalsIgnoreCase(account.getPassword())) {
                return false;
            } else {
                return true;
            }
        }

    }

    public List<Account> selectByEmail(String email) {
        Account account = new Account();
        account.setEmail(email);
        account.setEnabled(true);
        return accountMapper.select(account);
    }
}
