package pn.example.apiserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pn.example.apiserver.entity.ExampleAccount;
import pn.example.apiserver.entity.ExampleAccountDetail;
import pn.example.apiserver.entity.LoginInfo;
import pn.example.apiserver.service.ExampleAccountDetailService;
import pn.example.apiserver.service.ExampleAccountService;

/**
 * @author
 *
 */
@RestController
public class ExampleAccountRestController {

	@Autowired
	private ExampleAccountService accountService;

	@Autowired
	private ExampleAccountDetailService accountDetailService;

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/api/login")
	public ResponseEntity<?> getAccount(@RequestBody LoginInfo login) {
		ExampleAccount resultAccount = accountService.retrieveExampleAccountByEmailAndPassword(login.getEmail(),
				login.getPassword());
		if (resultAccount != null) {
			return new ResponseEntity<ExampleAccount>(resultAccount, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/api/accounts")
	public List<ExampleAccountDetail> getAccounts() {
		List<ExampleAccountDetail> accounts = accountDetailService.retrieveExampleAccountDetails();
		return accounts;
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/api/account")
	public ExampleAccountDetail getAccountsByType(@RequestParam(name="accountId")Long accountId) {
		ExampleAccountDetail account = accountDetailService.getExampleAccountDetail(accountId);
		return account;
	}
	
}