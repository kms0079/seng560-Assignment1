/*******************************************
 * This class of unit tests is
 * used to verify that the addition
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;


class AdditionTests {
	
	private static ArithmeticFunctions arithmeticFunctions;


	@BeforeAll
	static void setUp() throws Exception {
		arithmeticFunctions = new ArithmeticFunctions();
	}

	
	@Test
	void additionNoDecimals() {
		float values1 = arithmeticFunctions.addition(1f, 7f);				
		assertEquals(8f, values1);
		
		float values2 = arithmeticFunctions.addition(1000f, 70f);				
		assertEquals(1070f, values2);
		
	}
	
	@Test
	void additionBothDecimals() {
		float values1 = arithmeticFunctions.addition(1.2f, 2.2f);				
		assertEquals(3.4000000000000004f, values1);
		
		float values2 = arithmeticFunctions.addition(10.78f, 3.2f);				
		assertEquals(13.98f, values2);
		
	}
	
	@Test
	void additionOneDecimalOneNot() {
		float values1 = arithmeticFunctions.addition(1f, 100.3f);				
		assertEquals(101.3f, values1);
		
		float values2 = arithmeticFunctions.addition(80f, 10.897f);				
		assertEquals(90.897f, values2);
		
	}
	
	@Test
	void additionOnePositiveOneNegative() {
		float values1 = arithmeticFunctions.addition(-20f, 10f);				
		assertEquals(-10f, values1);
		
		float values2 = arithmeticFunctions.addition(-44f, 6.90f);				
		assertEquals(-37.1f, values2);
		
	}
	
	@Test
	void additionBothNegative() {
		float values1 = arithmeticFunctions.addition(-55, -30);				
		assertEquals(-85f, values1);
		
		float values2 = arithmeticFunctions.addition(-9.9f, -20.98f);				
		assertEquals(-30.880000000000003f, values2);
		
	}

}
