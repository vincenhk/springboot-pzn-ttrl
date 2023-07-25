package attendancemini.string.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.lifecyclemtc.Connection;

public class LifeCycleTest {

	ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LifeCycleBeanConfig.class);
		context.registerShutdownHook();
	}

	@AfterEach
	void tearDown() {
//		context.close();
	}

	@Test
	void testLifeCycle() {
		Connection connection = context.getBean(Connection.class);

	}
}
