package pn.example.apiserver.service;


import java.util.List;

import pn.example.apiserver.entity.ExampleAccountDetail;

/**
 * @author
 *
 */
public interface ExampleAccountDetailService {
 public List<ExampleAccountDetail> retrieveExampleAccountDetails();
 
 public ExampleAccountDetail getExampleAccountDetail(Long ExampleAccountDetailId);
 
 public void saveExampleAccountDetail(ExampleAccountDetail ExampleAccountDetail);
 
 public void deleteExampleAccountDetail(Long ExampleAccountDetailId);
 
 public void updateExampleAccountDetail(ExampleAccountDetail ExampleAccountDetail);

 public ExampleAccountDetail retrieveExampleAccountDetailByAccountNumber(String accountNumber);

public List<ExampleAccountDetail> retrieveExampleAccountDetailsByTypeAndNumber(String accountType, String accountNumber);

}