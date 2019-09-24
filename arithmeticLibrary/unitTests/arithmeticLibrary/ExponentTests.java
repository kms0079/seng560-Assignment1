/*******************************************
 * This class of unit tests is
 * used to verify that the exponent
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;

class ExponentTests {

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
		float values1 = arithmeticFunctions.exponent(2f, 2f);				
		assertEquals(4f, values1);
		
		float values2 = arithmeticFunctions.exponent(4f, 3f);				
		assertEquals(64f, values2);
		
	}
	
	@Test
	void multiplicationBothDecimals() {
		float values1 = arithmeticFunctions.exponent(5.2f, 2.2f);				
		assertEquals(37.6016892516f, values1);
		
		float values2 = arithmeticFunctions.exponent(12.3f, 1.2f);				
		assertEquals(20.318245f, values2);
		
	}
	
	@Test
	void multiplicationOneDecimalOneNot() {
		float values1 = arithmeticFunctions.exponent(13f, 66.3f);				
		assertEquals(Float.POSITIVE_INFINITY, values1);
		
		float values2 = arithmeticFunctions.exponent(74f, 07.497f);				
		assertEquals(1.03188334E14f, values2);
		
	}
	
	@Test
	void multiplicationOnePositiveOneNegative() {
		float values1 = arithmeticFunctions.exponent(-30f, 13f);				
		assertEquals(-1.594323E19f, values1);
		
		float values2 = arithmeticFunctions.exponent(4f, -3.90f);				
		assertEquals(0.0044871024f, values2);
		
	}
	
	@Test
	void multiplicationBothNegative() {
		
		float values1 = arithmeticFunctions.exponent(-3.9f, -50.98f);				
		assertEquals(Float.NaN, values1);
		
	}
}
