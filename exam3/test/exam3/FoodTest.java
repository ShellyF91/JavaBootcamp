package exam3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class FoodTest {
	
	Food[] foods = new Food[4]; 
	
	public FoodTest() {
		foods[0] = new Food("tofu", "UMAMI", "PROTEIN");
		foods[1] = new Food("bamba", "SALTY", "FAT");
		foods[2] = new Food("Tahini", "BITTER", "FAT");
		foods[3] = new Food("Chocolate", "SWEET", "CARBOHYDRATE");
	}
	
	@DisplayName("true should be returned onlt is the food is sweet and a carbohydrate.")
	@Test
	void checkIsDessert() {
		assertEquals(true, foods[3].isDessert());
		assertEquals(false, foods[1].isDessert());
	}
	
	@DisplayName("should throw an exception only if first letter is not upper-case.")
	@Test
	void checkSetName() {
		assertThrows(NonCapatilizedException.class, ()->foods[0].setName());
	}
	
	
	
	



}
