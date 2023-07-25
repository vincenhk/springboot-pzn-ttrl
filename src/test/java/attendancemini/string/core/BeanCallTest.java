package attendancemini.string.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;

public class BeanCallTest {
	@Test
	void BeanCallTest () { 
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		assertNotNull(context);
	}
	
	@Test
	void testGetBean() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);
		
		Assertions.assertSame(foo1, foo2);
	}
}
