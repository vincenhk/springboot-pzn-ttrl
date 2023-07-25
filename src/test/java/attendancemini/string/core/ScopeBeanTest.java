package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import attendancemini.string.core.data.Foo;

public class ScopeBeanTest {
	ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ScopeBeanConfig.class);
	}
	
	@Test
	void testScopeBean() {
		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);
		Foo foo3 = context.getBean(Foo.class);
		
		Assertions.assertNotSame(foo1, foo2);
		Assertions.assertNotSame(foo2, foo3);
		Assertions.assertNotSame(foo1, foo3);
		
	}
}
