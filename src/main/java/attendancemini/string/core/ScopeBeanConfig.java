package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import attendancemini.string.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeBeanConfig {
	/**
	 * Scope bean merupakan strategy cara sebuah object dibuat
	 * Secara default strategy object di Spring adalah singleton, artinya hanya dibuat sekali, dan ketika kita akses, akan mengembalikan object yang sama.
	 * Namun kita juga bisa mengubah scope bean yang kita mau di Spring
	 * Untuk mengubah scope sebuah bean, kita bisa tambahkan annotation @Scoope(value = "[Nama Scope]")
	 * 
	 * Type Scope Bean
	 * Singleton => Dibuat sekali dalam Spring IoC (Default)
	 * Prototype => Dibuat object baru setiap kali bean diakses
	 * Request => Dibuat baru per HTTP Request (Hanya untuk web App)
	 * Session => Dibuat baru per HTTP Session (Hanya untuk web App)
	 * Application => Dibuat baru per ServletContext (Hanya untuk Web App)
	 * Websocket => Dibuat baru per WebSocket(Hanya untuk webSocket App)
	 * 
	 * **/
	
	@Bean
	@Scope("prototype")
	public Foo foo() {
		log.info("Create new Foo");
		return new Foo();
	}
}
