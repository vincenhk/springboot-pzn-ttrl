package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;

public class ChangeNameBeanTest {
	
	ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ChangeNameBeanConfig.class);
	}
	
	@Test
	void TestChangeName() {
		Foo foo = context.getBean(Foo.class);
		Foo foo1 = context.getBean("fooFirst",Foo.class);
		Foo foo2 = context.getBean("fooSecond", Foo.class);
		
		Assertions.assertSame(foo, foo1);
	}
}
