package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.FooBar;

public class OptionalTest {

	ConfigurableApplicationContext context;
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
		context.registerShutdownHook();
	}
	
	@Test
	void testOptional() {
		Foo foo = context.getBean(Foo.class);
		FooBar fooBar = context.getBean(FooBar.class);
		
		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertNull(fooBar.getBar());
	}
}
