/*******************************************
 * This class of unit tests is
 * used to verify that the subtraction
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;

class SubtractionTests {

	private static ArithmeticFunctions arithmeticFunctions;


	@BeforeAll
	static void setUp() throws Exception {
		arithmeticFunctions = new ArithmeticFunctions();
	}

	
	@Test
	void subtractionNoDecimals() {
		float values1 = arithmeticFunctions.subtraction(90f, 17f);				
		assertEquals(73f, values1);
		
		float values2 = arithmeticFunctions.subtraction(76f, 45f);				
		assertEquals(31f, values2);
		
	}
	
	@Test
	void subtractionBothDecimals() {
		float values1 = arithmeticFunctions.subtraction(1.2f, 2.2f);				
		assertEquals(-1.0000000000000002f, values1);
		
		float values2 = arithmeticFunctions.subtraction(10.78f, 3.2f);				
		assertEquals(7.579999999999999f, values2);
		
	}
	
	@Test
	void subtractionOneDecimalOneNot() {
		float values1 = arithmeticFunctions.subtraction(13f, 66.3f);				
		assertEquals(-53.300003f, values1);
		
		float values2 = arithmeticFunctions.subtraction(74f, 07.497f);				
		assertEquals(66.503f, values2);
		
	}
	
	@Test
	void subtractionOnePositiveOneNegative() {
		float values1 = arithmeticFunctions.subtraction(-20f, 10f);				
		assertEquals(-30f, values1);
		
		float values2 = arithmeticFunctions.subtraction(-44f, 6.90f);				
		assertEquals(-50.9f, values2);
		
	}
	
	@Test
	void subtractionBothNegative() {
		float values1 = arithmeticFunctions.subtraction(-55f, -30f);				
		assertEquals(-25f, values1);
		
		float values2 = arithmeticFunctions.subtraction(-9.9f, -20.98f);				
		assertEquals(11.08f, values2);
		
	}

}


