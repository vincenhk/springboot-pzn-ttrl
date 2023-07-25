package attendancemini.string.core.data;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MultiFoo {
	
	/**
	 * Penganti dari Optional sebelum ada java 8
	 * FUngsinya lebih fleksibel untuk mengambil semua Object yang sama dari @Bean
	 * **/
	
	@Getter
	private List<Foo> foos;

	public MultiFoo(ObjectProvider<Foo> objectProvider) {
		this.foos = objectProvider.stream().collect(Collectors.toList());
	}
	
	
}
