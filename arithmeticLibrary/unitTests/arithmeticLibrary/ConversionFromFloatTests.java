/*******************************************
 * This class of unit tests is
 * used to verify that the methods to convert
 * from float to int/binary/octal/hex in
 * Conversions.java behaves as expected 
 * in various scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.Conversions;

class ConversionFromFloatTests {

	private static Conversions conversions;

	@BeforeAll
	static void setUp() throws Exception {
		conversions = new Conversions();
	}

	@Test
	void convertFloatToInt() {
		int values1 = conversions.floatToInt(7.343f);
		assertEquals(7, values1);

		int values2 = conversions.floatToInt(-1000.3434f);
		assertEquals(-1000, values2);
	}

	@Test
	void convertFloatToBinary() {
		String values1 = conversions.floatToBinary(11.0f);
		assertEquals("1011", values1);

		String values2 = conversions.floatToBinary(15.4f);
		assertEquals("1111", values2);
	}

	@Test
	void convertFloatToOctal() {
		String values1 = conversions.floatToOctal(9.0f);
		assertEquals("11", values1);

		String values2 = conversions.floatToOctal(50.3f);
		assertEquals("62", values2);
	}

	 @Test
	void convertFloatToHex() {
		String values1 = conversions.floatToHex(100f);
		assertEquals("64", values1);

		String values2 = conversions.floatToHex(76.6f);
		assertEquals("4d", values2);
	}

}

