package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Foo;

public class TestDuplicate {
	@Test
	void TestDuplicate() {
		ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
		
//		Foo foo = context.getBean(Foo.class); //error
		Foo foo1 = context.getBean("foo1", Foo.class);
		Foo foo2 = context.getBean("foo2", Foo.class);
		
		
		Assertions.assertNotSame(foo1, foo2);
	}
}
