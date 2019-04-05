package pn.example.apiserver.service;


import java.util.List;

import pn.example.apiserver.entity.ExampleUser;

/**
 * @author
 *
 */
public interface ExampleUserService {
 public List<ExampleUser> retrieveExampleUsers();
 
 public ExampleUser getExampleUser(Long ExampleUserId);
 
 public void saveExampleUser(ExampleUser ExampleUser);
 
 public void deleteExampleUser(Long ExampleUserId);
 
 public void updateExampleUser(ExampleUser ExampleUser);
}