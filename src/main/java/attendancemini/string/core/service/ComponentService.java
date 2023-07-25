package attendancemini.string.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import attendancemini.string.core.repository.ProductRepository;
import lombok.Getter;

@Component
public class ComponentService {
	
	/**
	 * Pertama yang kita lakukan untuk dependency nicection di @Component adalah menggunakan contructor parameter
	 * kita bisa menambahkan contructor yang memiliki parameter jika membutuhkan bean lain
	 * secara otomatis spring aan mencarikan bean tersebut dan ketika membuat bean @Component, Spring akan menggunakan bean yang dibutuhkan i constructor
	 * constructor base dependency injection hanya mendukung satu constructor, jadi pastikan hanya membuat satu constructor
	 * **/
	
	@Getter
	private ProductRepository productRepository;
	
	@Autowired
	public ComponentService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public ComponentService(ProductRepository productRepository, String name) {
		this.productRepository = productRepository;
	}
}

