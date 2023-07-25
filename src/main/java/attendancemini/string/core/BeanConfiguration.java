package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {

	@Bean
	public Foo foo() {
		Foo foo = new Foo();
		log.info("Create New Foo");
		return foo;
	}

}
