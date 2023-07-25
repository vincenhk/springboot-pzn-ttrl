package attendancemini.string.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import attendancemini.string.core.repository.CustomerRepository;
import lombok.Getter;

@Component
public class CustomerService {

	@Getter
	private CustomerRepository customerRepository;
	
	@Getter
	@Autowired
	@Qualifier("premiumCustomerConfiguration")
	private CustomerRepository premiumCustomerConfiguration;
	
	@Getter
	@Autowired
	@Qualifier("normalCustomerConfiguration")
	private CustomerRepository normalCustomerConfiguration;
}
