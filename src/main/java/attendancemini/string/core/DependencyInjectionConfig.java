package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.FooBar;

@Configuration
public class DependencyInjectionConfig {
	@Primary
	@Bean
	public Foo foo() {
		return new Foo();
	}
	
	@Bean
	public Bar bar() {
		return new Bar();
	}
	
	@Bean
	public FooBar fooBar(Foo foo, Bar bar) {
		return new FooBar(foo, bar);
	}
}
