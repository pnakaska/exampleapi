package pn.example.apiserver.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pn.example.apiserver.entity.ExampleAccountDetail;
import pn.example.apiserver.repository.ExampleAccountDetailRepository;
import pn.example.apiserver.service.ExampleAccountDetailService;

/**
 * @author
 *
 */
@Service
public class ExampleAccountDetailServiceImpl implements ExampleAccountDetailService {

	@Autowired
	private ExampleAccountDetailRepository exampleAccountDetailRepository;

	public void setExampleAccountRepository(ExampleAccountDetailRepository exampleAccountDetailRepository) {
		this.exampleAccountDetailRepository = exampleAccountDetailRepository;
	}

	public List<ExampleAccountDetail> retrieveExampleAccountDetails() {
		List<ExampleAccountDetail> exampleAccountDetails = exampleAccountDetailRepository.findAll();
		return exampleAccountDetails;
	}

	public ExampleAccountDetail getExampleAccountDetail(Long exampleAccountDetailId) {
		Optional<ExampleAccountDetail> optEmp = exampleAccountDetailRepository.findById(exampleAccountDetailId);
		return optEmp.get();
	}

	public void saveExampleAccountDetail(ExampleAccountDetail exampleAccountDetail) {
		exampleAccountDetailRepository.save(exampleAccountDetail);
	}

	public void deleteExampleAccountDetail(Long exampleAccountDetailId) {
		exampleAccountDetailRepository.deleteById(exampleAccountDetailId);
	}

	public void updateExampleAccountDetail(ExampleAccountDetail exampleAccountDetail) {
		exampleAccountDetailRepository.save(exampleAccountDetail);
	}

	@Override
	public ExampleAccountDetail retrieveExampleAccountDetailByAccountNumber(String accountNumber) {
		ExampleAccountDetail accountDetail = exampleAccountDetailRepository
				.retrieveExampleAccountDetailByAccountNumber(accountNumber);
		return accountDetail;
	}

	@Override
	public List<ExampleAccountDetail> retrieveExampleAccountDetailsByTypeAndNumber(String accountType,
			String accountNumber) {
		List<ExampleAccountDetail> accountDetail = exampleAccountDetailRepository
				.retrieveExampleAccountDetailsByTypeAndNumber(accountType, accountNumber);
		return accountDetail;
	}

}