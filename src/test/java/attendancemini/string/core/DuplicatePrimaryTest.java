package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;

public class DuplicatePrimaryTest {

	private ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(DuplicatePrimaryBeanConfig.class);
	}
	
	@Test
	void TestDuplicatePrimary() {
		
		//Flag Primary on config choosing same type class
		Foo foo = context.getBean(Foo.class);
		Foo foo1 = context.getBean("foo1", Foo.class);
		Foo foo2 = context.getBean("foo2", Foo.class);
		
		
		Assertions.assertSame(foo, foo1);
//		Assertions.assertNotSame(foo1, foo2);
		
	}
}
