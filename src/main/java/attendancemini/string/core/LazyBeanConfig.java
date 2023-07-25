package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LazyBeanConfig {
	/**
	 * Secara default, bean di spring akan di buat ketika aplikasi spring pertama kali berjalan.
	 * Oleh karena itu, kadang ketika aplikasi Spring pertama berjalan akan sedikit lamban, hal ini karena semua bean akan dibuat di awal.
	 * Namun jika kita mau, kita juga bisa membuat sebuat bean menjadi lazy (malas), dinama bean tidak akan dibuat, sampai memang di akses atau di butuhkan.
	 * Untuk membuat sebuah menjadi lazy, kita bisa tambahkan annotation @Lazy pada Bean tersebut.
	 * **/
	
	@DependsOn(value = "bar")
	@Bean
	@Lazy
	public Foo fooFirst() {
		log.info("New Creat Foo");
		return new Foo();
	}

	@Bean
	public Bar bar() {
		log.info("New Creat Bar");
		return new Bar();
	}
	
}
