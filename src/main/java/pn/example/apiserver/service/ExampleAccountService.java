package pn.example.apiserver.service;


import java.util.List;

import pn.example.apiserver.entity.ExampleAccount;

/**
 * @author
 *
 */
public interface ExampleAccountService {
 public List<ExampleAccount> retrieveExampleAccounts();
 
 public ExampleAccount getExampleAccount(Long ExampleAccountId);
 
 public void saveExampleAccount(ExampleAccount ExampleAccount);
 
 public void deleteExampleAccount(Long ExampleAccountId);
 
 public void updateExampleAccount(ExampleAccount ExampleAccount);

 public ExampleAccount retrieveExampleAccountByEmailAndPassword(String email, String password);

}