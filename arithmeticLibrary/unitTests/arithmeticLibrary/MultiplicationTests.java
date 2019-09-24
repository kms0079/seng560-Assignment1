/*******************************************
 * This class of unit tests is
 * used to verify that the multiplication
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;

class MultiplicationTests {


	private static ArithmeticFunctions arithmeticFunctions;

	/**
	 * @return 
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUp() throws Exception {
		arithmeticFunctions = new ArithmeticFunctions();
	}

	
	@Test
	void multiplicationNoDecimals() {
		float values1 = arithmeticFunctions.multiplication(3f, 4f);				
		assertEquals(12f, values1);
		
		float values2 = arithmeticFunctions.multiplication(56f, 42f);				
		assertEquals(2352f, values2);
		
	}
	
	@Test
	void multiplicationBothDecimals() {
		float values1 = arithmeticFunctions.multiplication(5.2f, 2.2f);				
		assertEquals(11.440000000000001f, values1);
		
		float values2 = arithmeticFunctions.multiplication(132.34f, 3.2f);				
		assertEquals(423.48800000000006f, values2);
		
	}
	
	@Test
	void multiplicationOneDecimalOneNot() {
		float values1 = arithmeticFunctions.multiplication(13f, 66.3f);				
		assertEquals(861.9f, values1);
		
		float values2 = arithmeticFunctions.multiplication(74f, 07.497f);				
		assertEquals(554.778f, values2);
		
	}
	
	@Test
	void multiplicationOnePositiveOneNegative() {
		float values1 = arithmeticFunctions.multiplication(-30f, 13f);				
		assertEquals(-390f, values1);
		
		float values2 = arithmeticFunctions.multiplication(-4f, 3.90f);				
		assertEquals(-15.6f, values2);
		
	}
	
	@Test
	void multiplicationBothNegative() {
		float values1 = arithmeticFunctions.multiplication(-75f, -40f);				
		assertEquals(3000f, values1);
		
		float values2 = arithmeticFunctions.multiplication(-3.9f, -50.98f);				
		assertEquals(198.82199999999997f, values2);
		
	}

}
