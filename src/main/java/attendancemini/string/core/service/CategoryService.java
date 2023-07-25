package attendancemini.string.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import attendancemini.string.core.repository.CategoryRepository;
import lombok.Getter;
import lombok.Setter;

@Component
public class CategoryService {
	/**
	 * Setter Dependenct Injection
	 * Menggunakan @Autowire untuk menjalankannya sebagai new bean
	 **/
	
	
	@Getter
	private CategoryRepository categoryRepository;

	@Autowired
	public void setCategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

}
