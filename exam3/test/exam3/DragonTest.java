package exam3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DragonTest {

	Dragon dragon; 
	
	public DragonTest() {
		dragon = new Dragon("Drogon", 1,1,900,10); 
	}
	

	
	@DisplayName("should throw an exception only if birthdate is after 8/8/888")
	@Test
	void checkSetBirthDate() {
		assertThrows(TooYoungException.class, ()->dragon.setBirthDate());
	}
}
