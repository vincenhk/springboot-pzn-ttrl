package attendancemini.string.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseText {
	@Test
	void testSingleton() {
		var database1 = Database.getInstance();
		var database2 = Database.getInstance();
		
		Assertions.assertEquals(database1, database2);
		
		System.out.println("Running Database");
		
	}
}
