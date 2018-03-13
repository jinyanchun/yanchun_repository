package cn.oa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.oa.pojo.Account;
import cn.oa.pojo.EasyuiResult;
import cn.oa.service.AccountService;

@Controller
@RequestMapping("account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addAccount(Account account){
		try {
			this.accountService.savaAccount(account);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	@RequestMapping(method={RequestMethod.GET})
	public ResponseEntity<EasyuiResult> queryAccount(@RequestParam(value="page",defaultValue="1")Integer page,@RequestParam(value="rows",defaultValue="10")Integer rows){

		EasyuiResult result = this.accountService.queryAccount(page,rows);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	@RequestMapping(method={RequestMethod.DELETE},value="delete")
	public ResponseEntity<Void> deleteAccount(String ids){
		try {
			this.accountService.deleteAccount(ids);
			return ResponseEntity.status(HttpStatus.OK).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	@RequestMapping(value="getAccount",method={RequestMethod.GET})
	public ResponseEntity<Account> getAccount(Long id){
		Account account = this.accountService.getAccountById(id);
		return ResponseEntity.status(HttpStatus.OK).body(account);
	}
	@RequestMapping(method={RequestMethod.PUT})
	public ResponseEntity<Void> updateAccount(Account account){
		try {
			this.accountService.updateAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}
