package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = { "attendancemini.string.core.service", "attendancemini.string.core.repository",
		"attendancemini.string.core.configuration" })
@Import(MultiFoo.class)
public class ComponentConfiguration {

	@Primary
	@Bean
	public Foo foo1() {
		return new Foo();
	}

	@Bean
	public Foo foo2() {
		return new Foo();
	}

	@Bean
	public Foo foo3() {
		return new Foo();
	}
}
