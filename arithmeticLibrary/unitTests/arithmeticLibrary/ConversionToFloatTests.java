/*******************************************
 * This class of unit tests is
 * used to verify that the methods to convert
 * from int/binary/octal/hex to float in
 * Conversions.java behaves as expected 
 * in various scenarios
 ******************************************/

package arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.Conversions;

class ConversionToFloatTests {
	private static Conversions conversions;

	/**
	 * @return
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUp() throws Exception {
		conversions = new Conversions();
	}

	@Test
	void convertIntToFloat() {
		float values1 = conversions.intToFloat(7);
		assertEquals(7.0f, values1);

		float values2 = conversions.intToFloat(-1000);
		assertEquals(-1000f, values2);
	}

	@Test
	void convertBinaryToFloat() {
		float values1 = conversions.binaryToFloat("1011");
		assertEquals(11.0f, values1);

		float values2 = conversions.binaryToFloat("1111");
		assertEquals(15.0f, values2);
	}

	@Test
	void convertOctalToFloat() {
		float values1 = conversions.octalToFloat("11");
		assertEquals(9.0f, values1);

		float values2 = conversions.octalToFloat("62");
		assertEquals(50.0f, values2);
	}

	 @Test
	void convertHexToFloat() {
		float values1 = conversions.hexToFloat("64");
		assertEquals(100f, values1);

		float values2 = conversions.hexToFloat("4d");
		assertEquals(77f, values2);
	}

}