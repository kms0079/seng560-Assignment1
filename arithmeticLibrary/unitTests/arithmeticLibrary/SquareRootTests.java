/*******************************************
 * This class of unit tests is
 * used to verify that the squareRoot
 * method from ArithmeticFunctions.java
 * behaves as expected in various
 * scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.ArithmeticFunctions;

class SquareRootTests {


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
	void squareRootPositive() {
		float value1 = arithmeticFunctions.squareRoot(49f);				
		assertEquals(7f, value1);
		
		float value2 = arithmeticFunctions.squareRoot(4f);				
		assertEquals(2f, value2);
		
	}
	
	@Test
	void squareRootPositiveDecimal() {
		float value1 = arithmeticFunctions.squareRoot(6.6f);				
		assertEquals(2.569046515733026f, value1);
		
		float value2 = arithmeticFunctions.squareRoot(10.78f);				
		assertEquals(3.283291031876401f, value2);
		
	}
	
	@Test
	void squareRootNegative() {
		float value1 = arithmeticFunctions.squareRoot(-64f);				
		assertEquals(Float.NaN, value1);
		
		float value2 = arithmeticFunctions.squareRoot(-81f);				
		assertEquals(Float.NaN, value2);
		
	}
	
	@Test
	void squareRootNegativeDecimal() {
		float value1 = arithmeticFunctions.squareRoot(-.55f);				
		assertEquals(Float.NaN, value1);
		
		float value2 = arithmeticFunctions.squareRoot(-9.9f);				
		assertEquals(Float.NaN, value2);
		
	}

}