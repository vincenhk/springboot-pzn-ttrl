package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependencyOnConfig {
	int i = 0;
	/**
	 * Pembuatan bean yang bergantung dengan bean lain. jadi membuat urutan dalam pembentukan nya
	 * Terdapat perbedaan pengunaan untuk dependsOn sigle dan multiple 
	 * @DependsOn(value = "bar") single
	 * @DependsOn({"bar", "bar2"})
	 * **/
	@Bean
//	@DependsOn(value = "bar") //single 
	@DependsOn({
		"bar", "bar2"
	})
	public Foo foo() {
		i = i+1;
		log.info("Foo Create : "+ i);
		return new Foo();
	}
	
	@Primary
	@Bean
	public Bar bar() {
		i = i+1;
		log.info("Bar Create : "+ i);
		return new Bar();
	}
	
	@Bean
	public Bar bar2() {
		i = i+1;
		log.info("Bar2 Create : "+ i);
		return new Bar();
	}
}
