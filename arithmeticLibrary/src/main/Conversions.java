/********************************************
 * This class performs conversions
 * between different types of values
 * to allow for various types of input
 * and output needs. Because calculations
 * are performed using float values, 
 * methods are added to convert from float
 * to int/binary/octal/hex and conversely
 * from int/binary/octal/hex to float
 ********************************************/

package main;

public class Conversions {
	
	//float to int
	public int floatToInt(float value1)
	{
		return Math.round(value1);
	}
	
	//float to hex
	public String floatToHex(float value1)
	{
		int num = floatToInt(value1);
		String hexString;
		hexString = Integer.toHexString(num);
		return hexString;
	}

	//float to octal
	public String floatToOctal(float value1)
	{
		int num = floatToInt(value1);
		String octalString;
		octalString = Integer.toOctalString(num);
		return octalString;
	}
	
	//float to binary
	public String floatToBinary(float value1)
	{
		int num = floatToInt(value1);
		String binaryString;
		binaryString = Integer.toBinaryString(num);
		return binaryString;
	}
	
	////////////////////////////////////////////////////////////////////
	
	//int to float
	public float intToFloat(int value1)
	{
		return (float) value1;
	}
	
	//hex to float
	public float hexToFloat(String value1)
	{
		String hexString = value1; 
		int hexToInt = Integer.parseInt(hexString,16);
		float intToFloat = intToFloat(hexToInt);
		return intToFloat;
	}
	
	//octal to float
	public float octalToFloat(String value1)
	{
		String octalString = value1; 
		int octalToInt = Integer.parseInt(octalString,8);
		float intToFloat = intToFloat(octalToInt);
		return intToFloat;
	}
	
	//binary to float 
	public float binaryToFloat(String value1)
	{
		String binaryString = value1; 
		int binaryToInt = Integer.parseInt(binaryString,2);
		float intToFloat = intToFloat(binaryToInt);
		return intToFloat;
	}
	
}
