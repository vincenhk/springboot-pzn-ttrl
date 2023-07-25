package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.MultiFoo;
import attendancemini.string.core.repository.CategoryRepository;
import attendancemini.string.core.repository.CustomerRepository;
import attendancemini.string.core.repository.ProductRepository;
import attendancemini.string.core.service.CategoryService;
import attendancemini.string.core.service.ComponentService;
import attendancemini.string.core.service.CustomerService;

public class ComponentTest {
	ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		context.registerShutdownHook();
	}
	
//	@Test
//	void testComponent() {
//		ComponentService cs1 = context.getBean(ComponentService.class);
//		ComponentService cs2 = context.getBean("componentService", ComponentService.class);
//		
//		Assertions.assertSame(cs1, cs2);
//	}
	
//	@Test
//	void testConstructorDependencyInjection() {
//		ComponentService com1 = context.getBean(ComponentService.class);
//		ProductRepository productRepository = context.getBean(ProductRepository.class);
//		
//		Assertions.assertSame(productRepository, com1.getProductRepository());
//	}
	
//	@Test
//	void TestSetterDependencyInjection() {
//		CategoryService categoryService = context.getBean(CategoryService.class);
//		CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
//		
//		Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
//	}
//	
	
//	@Test
//	void TestSetterDependencyInjection() {
//		CustomerService customerService = context.getBean(CustomerService.class);
//		
//		CustomerRepository premiumCustomerConfiguration = context.getBean("premiumCustomerConfiguration",CustomerRepository.class);
//		CustomerRepository normalCustomerConfiguration = context.getBean("normalCustomerConfiguration",CustomerRepository.class);
//		
//		Assertions.assertSame(premiumCustomerConfiguration, customerService.getPremiumCustomerConfiguration());
//		Assertions.assertSame(normalCustomerConfiguration, customerService.getNormalCustomerConfiguration());
//	}
	
	@Test
	void testObjectProvider() {
		MultiFoo multiFoo = context.getBean(MultiFoo.class);
		Assertions.assertEquals(3 ,multiFoo.getFoos().size());
	}
}

