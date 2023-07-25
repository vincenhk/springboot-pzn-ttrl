package attendancemini.string.core.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
		FooConfiguration.class,
		BarConfiguration.class
})
public class MainConfiguration {
	
	/**
	 * Melakukan import Configuration dari beberapa class berbeda, supaya mempermudah mentenance 
	 * 
	 * **/

}
