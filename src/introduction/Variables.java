package introduction;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Byte
		 * min: -128
		 * max: 127
		 * default: 0
		 * any integers beyond this range will be an error
		 */
		byte byteVariable = 100;
		System.out.println("Byte Value: "+ byteVariable);
		
		/*
		 * Short
		 * min: -32,768
		 * max: 32,767
		 * default: 0
		 */
		short shortVariable = 1000;
		System.out.println("Short Value: " + shortVariable);
		
		/*
		 * int
		 * Min: -2,147,648
		 * Max: 2,147,647
		 * Default: 0
		 */
		int integerVariable = 1000000;
		System.out.println("int Value: " + integerVariable);
		
		/*
		 * long
		 * min:-2^53
		 * max:2^63 -1
		 * default:0
		 */
		long longVariable = 10000000L;
		System.out.println("Long Value: " + longVariable);
		
		/*
		 * float
		 * Default: 0.0f
		 * decimal number to the tenths
		 */
		float floatVariable = 20.1f;//must add f on end of float number
		System.out.println("Float Value = " + floatVariable);
		
		/*
		 * double
		 * default: 0.0d
		 * decimal number to the hundredths
		 */
		double doubleVariable = 60.33;
		System.out.println("double value = " + doubleVariable);
		
		/*
		 * boolean
		 * True and False
		 * Default: false
		 */
		boolean booleanVariable = true;
		System.out.println("Boolean value = " + booleanVariable);
		
		/*
		 * char
		 * min: 0
		 * max: 65,535
		 * min and max for this keyword doesnt really matter because we usually use actual characters
		 */
		char charVariable = 'a';//char needs ''
		System.out.println("char Value = " + charVariable);

	}

}
