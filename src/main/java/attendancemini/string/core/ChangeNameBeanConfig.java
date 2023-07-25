package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ChangeNameBeanConfig {

	@Primary
	@Bean (value = "fooFirst")
	public Foo foo1() {
		log.info("ROCK");
		return new Foo();
	}
	
	@Bean (value = "fooSecond")
	public Foo foo2() {
		log.info("ROCK2");
		return new Foo();
	}
}
