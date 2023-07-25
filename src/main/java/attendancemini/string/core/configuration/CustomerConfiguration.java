package attendancemini.string.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {
	
	@Primary
	@Bean
	public CustomerRepository normalCustomerConfiguration() {
		return new CustomerRepository();
	}
	
	@Bean
	public CustomerRepository premiumCustomerConfiguration() {
		return new CustomerRepository();
	}
	
}
