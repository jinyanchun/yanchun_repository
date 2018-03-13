package cn.oa.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.oa.mapper.AccountMapper;
import cn.oa.pojo.Account;
import cn.oa.pojo.CommonParameter;
import cn.oa.pojo.EasyuiResult;

@Service
public class AccountService {
	@Autowired
	private AccountMapper accountMapper;
	
	public void savaAccount(Account account) {
			account.setCreateTime(new Date());
			account.setUpdateTime(account.getCreateTime());
			this.accountMapper.savaAccount(account);
	}

	public EasyuiResult queryAccount(Integer page, Integer rows) {
		EasyuiResult result = new EasyuiResult();
		CommonParameter parameter = new CommonParameter(page,rows);
		List<Account> list = this.accountMapper.queryAccount(parameter);
		result.setRows(list);
		Integer total = this.accountMapper.countAccount();
		result.setTotal(total);
		return result;
	}

	public void deleteAccount(String ids) {
		List<String> list = new ArrayList<String>();
		if (ids.indexOf(",")>0) {
			String[] idarr = ids.split(",");
			for (String id : idarr) {
				list.add(id);
			}
		}else {
			list.add(ids);
		}
		this.accountMapper.deleteAccount(list);
	}

	public Account getAccountById(Long id) {
		
		return this.accountMapper.getAccountById(id);
	}

	public void updateAccount(Account account) {
		account.setUpdateTime(new Date());
		this.accountMapper.updateAccount(account);
	}
	
}
