import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import CustomerTshirts.Color;

@TestInstance(Lifecycle.PER_METHOD)

class ColorTest {
	
	Color[] colors = new Color[3]; 
	
	public ColorTest() {
		colors[0] = new Color((short)1,(short)34,(short)55);
		colors[1] = new Color((short)40,(short)256,(short)230);
		colors[2] = new Color((short)9,(short)6,(short)0);
	}
	
	
	@DisplayName("The array of colors should not contain null elements.")
	@Test
	void checkColorsArray() {
		assertNotNull (colors[0]);
		assertNotNull (colors[1]);
		assertNotNull (colors[2]);	
	}
	
	@DisplayName("The fields of the objects in the array of colors should be as given.")
	@Test
	void checkColorsFields() {
		assertEquals(1, colors[0].getRed());
		assertEquals(34, colors[0].getGreen());
		assertEquals(55, colors[0].getBlue());
		//to add for elements 1 + 2 
	}
	

	@DisplayName("The dominant color should be correct")
	@Test
	void checkDominantColor() {
		assertEquals("blue", colors[0].getDominant());
		assertEquals("green", colors[1].getDominant());
		assertEquals("red", colors[2].getDominant());

	}
	
	@DisplayName("The normalized value should be correct")
	@Test
	void checkNormalizedColor() {
		float[] normalizedTest = colors[0].normalized();
		
		assertEquals((float)1/255, normalizedTest[0]);
		assertEquals((float)34/255, normalizedTest[1]);
		assertEquals((float)55/255, normalizedTest[2]);
	}

	@DisplayName("My own test - values should be in limits")
	@Test
	void checkValuesLimits() {
		Color color = new Color((short)-2,(short) 256, (short)8);
		
		assertEquals(0, color.getRed());
		assertEquals(255, color.getGreen());
		assertEquals(8, color.getBlue());
	}
	
	

}
