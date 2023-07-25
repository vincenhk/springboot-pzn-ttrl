package attendancemini.string.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.lifecyclemtc.Connection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LifeCycleBeanConfig {
	/**
	 * Secara default, bean tidak bisa tahu alur hidup Spring ketika selesai membuat bean dan ketika akan menghancurkan bean
	 * jika kita tertarik untuk beraksi ketika alur hidup Spring terjadi, maka kita bisa implements interface InitializingBean dan DisposableBean
	 * InitializingBean digunakan jika kita ingin beraksi ketika spring selesai membuat bean.
	 * 		- Callback InitializingBean using method afterPropertiesSet()
	 * DisposiableBea digunakan jika kita ingin bereaksi ketika Spring akan menghancurkan bean.
	 * 		- Callback DisposiableBean using method destroy()
	 * **/
	
	@Bean
	public Connection connection() {
		return new Connection();
	}

	
	
	
}
