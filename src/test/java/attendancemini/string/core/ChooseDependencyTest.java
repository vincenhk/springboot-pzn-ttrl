package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.FooBar;

public class ChooseDependencyTest {
	ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ChooseDependencyConfig.class);
	}
	
	@Test
	void testChooseDependencyTest() {
		Foo foo = context.getBean("fooSecond",Foo.class);
		Bar bar = context.getBean(Bar.class);
		FooBar fooBar = context.getBean(FooBar.class);
		
		Assertions.assertSame(foo, fooBar.getFoo());
	}
}





