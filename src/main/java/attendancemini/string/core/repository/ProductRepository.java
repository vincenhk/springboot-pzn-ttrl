package attendancemini.string.core.repository;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProductRepository {

	/**
	 *Constructor Dependenct Injection
	 * **/
	public ProductRepository() {
		log.info("New Create Bean ProductRepository");
	}
	
	

}
