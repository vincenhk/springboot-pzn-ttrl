package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyTest {
	ApplicationContext context;
	
	@Test
	void setUp() {
		Assertions.assertThrows(Throwable.class, () -> {
			context = new AnnotationConfigApplicationContext(CircularDependencyConfig.class);
		});
	}
	
}
