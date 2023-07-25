package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {
	@Test
	void TestApplicationContext() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Assertions.assertNotNull(context);
	}
}
