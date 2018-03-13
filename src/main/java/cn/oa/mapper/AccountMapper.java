package cn.oa.mapper;

import java.util.List;

import cn.oa.pojo.Account;
import cn.oa.pojo.CommonParameter;

public interface AccountMapper {

	void savaAccount(Account account);

	List<Account> queryAccount(CommonParameter parameter);

	Integer countAccount();

	void deleteAccount(List<String> list);

	Account getAccountById(Long id);

	void updateAccount(Account account);


}
