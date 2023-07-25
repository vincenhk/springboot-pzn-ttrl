package attendancemini.string.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"attendancemini.string.core.ConfigImport"
})
public class ComponentScanConfiguration {
	/**
	 * Melakukan Import jika sudah terlalu banyak dengan mengscan package yang di registrasikan
	 * akan mendeteksi semua file yang terdapat annotation @Configuration
	 * **/
}
