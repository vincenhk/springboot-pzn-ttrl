package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.data.cyclic.CyclicA;
import attendancemini.string.core.data.cyclic.CyclicB;
import attendancemini.string.core.data.cyclic.CyclicC;

@Configuration

public class CircularDependencyConfig {
	/**
	 * Circular Dependency adalah sebuah siklus dimana sebuah lingkaran dependency terjadi.
	 * Contoh A membutuhkan B, B membutuhkan C, dan C membutuhkan A
	 * Secara automatic Spring akan mendeteksi sebagai error
	 * **/
	
	@Bean
	public CyclicA cycleA(CyclicB data) {
		return new CyclicA(data);
	}
	
	@Bean
	public CyclicB cycleB(CyclicC data) {
		return new CyclicB(data);
	}
	
	@Bean
	public CyclicC cycleC(CyclicA data) {
		return new CyclicC(data);
	}
}
