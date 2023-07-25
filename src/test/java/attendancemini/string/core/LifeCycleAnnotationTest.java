package attendancemini.string.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import attendancemini.string.core.data.Server;

public class LifeCycleAnnotationTest {
	
	ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LifeCycleAnnotationConfig.class);
		context.registerShutdownHook();
	}
	
	@Test
	public void testLifeCycleAnnotation () {
		Server server = context.getBean(Server.class);
	}
}
