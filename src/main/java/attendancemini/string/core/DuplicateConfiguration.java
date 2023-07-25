package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.data.Foo;

@Configuration
public class DuplicateConfiguration {
	@Bean
	public Foo foo1() {
		return new Foo();
	}
	
	@Bean
	public Foo foo2() {
		return new Foo();
	}
}
