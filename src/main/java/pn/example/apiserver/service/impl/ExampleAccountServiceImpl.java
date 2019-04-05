package pn.example.apiserver.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pn.example.apiserver.entity.ExampleAccount;
import pn.example.apiserver.repository.ExampleAccountRepository;
import pn.example.apiserver.service.ExampleAccountService;

/**
 * @author
 *
 */
@Service
public class ExampleAccountServiceImpl implements ExampleAccountService {

	@Autowired
	private ExampleAccountRepository exampleAccountRepository;

	public void setExampleAccountRepository(ExampleAccountRepository exampleAccountRepository) {
		this.exampleAccountRepository = exampleAccountRepository;
	}

	public List<ExampleAccount> retrieveExampleAccounts() {
		List<ExampleAccount> ExampleAccounts = exampleAccountRepository.findAll();
		return ExampleAccounts;
	}

	public ExampleAccount getExampleAccount(Long ExampleAccountId) {
		Optional<ExampleAccount> optEmp = exampleAccountRepository.findById(ExampleAccountId);
		return optEmp.get();
	}

	public void saveExampleAccount(ExampleAccount ExampleAccount) {
		exampleAccountRepository.save(ExampleAccount);
	}

	public void deleteExampleAccount(Long ExampleAccountId) {
		exampleAccountRepository.deleteById(ExampleAccountId);
	}

	public void updateExampleAccount(ExampleAccount ExampleAccount) {
		exampleAccountRepository.save(ExampleAccount);
	}

	@Override
	public ExampleAccount retrieveExampleAccountByEmailAndPassword(String email, String password) {
		ExampleAccount account = exampleAccountRepository.retrieveExampleAccountByEmailAndPassword(email, password);
		return account;
	}
}