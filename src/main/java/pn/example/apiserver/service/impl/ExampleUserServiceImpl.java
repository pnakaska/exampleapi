package pn.example.apiserver.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pn.example.apiserver.entity.ExampleUser;
import pn.example.apiserver.repository.ExampleUserRepository;
import pn.example.apiserver.service.ExampleUserService;

/**
 * @author
 *
 */
@Service
public class ExampleUserServiceImpl implements ExampleUserService{

 @Autowired
 private ExampleUserRepository ExampleUserRepository;

 public void setExampleUserRepository(ExampleUserRepository ExampleUserRepository) {
  this.ExampleUserRepository = ExampleUserRepository;
 }
 
 public List<ExampleUser> retrieveExampleUsers() {
  List<ExampleUser> ExampleUsers = ExampleUserRepository.findAll();
  return ExampleUsers;
 }
 
 public ExampleUser getExampleUser(Long ExampleUserId) {
  Optional<ExampleUser> optEmp = ExampleUserRepository.findById(ExampleUserId);
  return optEmp.get();
 }
 
 public void saveExampleUser(ExampleUser ExampleUser){
  ExampleUserRepository.save(ExampleUser);
 }
 
 public void deleteExampleUser(Long ExampleUserId){
  ExampleUserRepository.deleteById(ExampleUserId);
 }
 
 public void updateExampleUser(ExampleUser ExampleUser) {
  ExampleUserRepository.save(ExampleUser);
 }
}