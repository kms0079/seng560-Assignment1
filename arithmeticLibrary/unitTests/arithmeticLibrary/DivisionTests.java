/*******************************************
 * This class of unit tests is
 * used to verify that the division
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;

class DivisionTests {


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
	void divisionNoDecimals() {
		float values1 = arithmeticFunctions.division(3f, 4f);				
		assertEquals(.75f, values1);
		
		float values2 = arithmeticFunctions.division(57f, 32f);				
		assertEquals(1.78125f, values2);
		
	}
	
	@Test
	void divisionBothDecimals() {
		float values1 = arithmeticFunctions.division(4.5f, 2.1f);				
		assertEquals(2.1428573f, values1);
		
		float values2 = arithmeticFunctions.division(152.34f, 32.2f);				
		assertEquals(4.731055900621118f, values2);
		
	}
	
	@Test
	void divisionOneDecimalOneNot() {
		float values1 = arithmeticFunctions.division(16f, 36.3f);				
		assertEquals(0.44077137f, values1);
		
		float values2 = arithmeticFunctions.division(14f, 05.7f);				
		assertEquals(2.4561405f, values2);
		
	}
	
	@Test
	void divisionOnePositiveOneNegative() {
		float values1 = arithmeticFunctions.division(-52f, 10f);				
		assertEquals(-5.2f, values1);
		
		float values2 = arithmeticFunctions.division(-3f, 2.30f);				
		assertEquals(-1.3043478260869565f, values2);
		
	}
	
	@Test
	void divisionBothNegative() {
		float values1 = arithmeticFunctions.division(-65f, -20f);				
		assertEquals(3.25f, values1);
		
		float values2 = arithmeticFunctions.division(-3.9f, -50.98f);				
		assertEquals(0.076500595f, values2);
		
	}

}
