package attendancemini.string.core;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.data.Bar;
import attendancemini.string.core.data.Foo;
import attendancemini.string.core.data.FooBar;

@Configuration
public class OptionalConfiguration {
	/**
	 * Secara default semua dependency itu wajib
	 * Artinya jika Sring tidak bisa menemukan bean yang dibutuhkan pada saat DI, maka secara otomatis akan terjadi error
	 * Namun jika kita memang ingin membuat sebuah dependency menjadi Optional, artinya tidak wajib
	 * kita bisa wrap dependency tersebut dengan memnggunakan java.util.Optional<T>
	 * Secara otomatis jika ternyata bean yang dibutuhkan tidak ada maka tidak akan menjadi error
	 * kita bisa gunakan Optional<T> pada @bean (method parameter) ataupun @Component
	 * (constructorm parameter, setter method parameter, field)
	 * **/
	
	@Bean
	public Foo foo() {
		return new Foo();
	}
	
	@Bean
	public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
		return new FooBar(foo.orElse(null), bar.orElse(null));
	}
}
