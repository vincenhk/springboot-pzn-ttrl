package attendancemini.string.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;

public class LazyBeanTest {
	
	ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LazyBeanConfig.class);
	}
	
	@Test
	void testLazyBean() {
		Foo foo = context.getBean("fooFirst", Foo.class);
	}
}
