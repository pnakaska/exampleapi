package pn.example.apiserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pn.example.apiserver.entity.ExampleAccountDetail;

@Repository
public interface ExampleAccountDetailRepository extends JpaRepository<ExampleAccountDetail,Long>{

	@Query("SELECT a FROM ExampleAccountDetail a WHERE a.accountNumber=?1")	
	ExampleAccountDetail retrieveExampleAccountDetailByAccountNumber(String accountNumber);
	@Query("SELECT a FROM ExampleAccountDetail a WHERE a.accountType=?1 and a.accountNumber=?2 ")	
	List<ExampleAccountDetail> retrieveExampleAccountDetailsByTypeAndNumber(String accountType, String accountNumber);

}