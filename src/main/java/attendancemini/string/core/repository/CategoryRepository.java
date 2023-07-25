package attendancemini.string.core.repository;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CategoryRepository {
	/**
	 * Setter Dependenct Injection
	 **/
	public CategoryRepository() {
		log.info("Create new CategoryRepository");
	}

}
