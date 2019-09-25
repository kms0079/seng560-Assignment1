# seng560-Assignment1

This project was developed in java. There are two classes that provide the basic functions needed in this library. ArithmeticFunctions.java was created to be able to perform basic arithmetic functions. These functions include addition, subtraction, multiplication, division, square root, and exponent. The methods performing these calculations accept float inputs and output. Second, Conversions.java was created to perform conversions between different types of values to allow for various types of input and output needs. This library provides the ability to convert from float to int/binary/octal/hex and conversely from int/binary/octal/hex to float. 

A suite of unit tests has been developed to ensure each of the functions and conversions mentioned above behave as expected. 

To ensure that the library is reusable: First, I chose to perform the arithmetic utilizing float values. This is because it provides the most granular value of the desired types of data. Second, through the conversions class, I made it possible to convert from any type to float or from float to any type. This makes it possible to accept, calculate, and return any of the expected types of data.
