package attendancemini.string.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import attendancemini.string.core.data.Server;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LifeCycleAnnotationConfig {
	/**
	 * Untuk LifeCyle Annotation ini dapat dilakukan implementasi dari InitializingBean dan DestroyBean dari Annotation
	 * Jika ingin menggunakan annotation langsung menggunakan @Bean(initMethod = "[Nama method dari kelas]", destroyMethod = "[Nama method dari kelas]")
	 * Terdapat pilihan juga langsung menggunakan annotation pada method yang akan di declare sebagai initialize dan destroyer menggunakan annotation berikut
	 * @PostConstruct => InitializingBean
	 * @PreDestroy => DestroyBean
	 * **/
//	@Bean(initMethod = "start", destroyMethod = "stop")
	@Bean
	public Server serverConn() {
		return new Server();
	}
}
