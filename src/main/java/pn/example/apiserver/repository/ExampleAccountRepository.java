package pn.example.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pn.example.apiserver.entity.ExampleAccount;

@Repository
public interface ExampleAccountRepository extends JpaRepository<ExampleAccount,Long>{

	@Query("SELECT a FROM ExampleAccount a WHERE a.email=?1 and a.password=?2")	
	ExampleAccount retrieveExampleAccountByEmailAndPassword(String email, String password);

}