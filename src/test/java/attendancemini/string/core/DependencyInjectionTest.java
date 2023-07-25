package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.FooBar;

public class DependencyInjectionTest {
	ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(DependencyInjectionConfig.class);
	}
	
	@Test
	void testNol() {
		
		var foo = context.getBean(Foo.class);
		var bar = context.getBean(Bar.class);
		var fooBar = context.getBean(FooBar.class);

		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertSame(bar, fooBar.getBar());
	}
}
