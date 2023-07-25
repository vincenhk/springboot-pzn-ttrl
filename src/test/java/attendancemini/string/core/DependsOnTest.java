package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
	@Test
	void setUp() {
		
			ApplicationContext context = new AnnotationConfigApplicationContext(DependencyOnConfig.class);
	}
}
