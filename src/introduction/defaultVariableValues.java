package introduction;

public class defaultVariableValues {
	
	//creating methods here with the 'static' syntax will make them "global" and usuable throughout this class
	
	static byte byteVariable;
	static short shortVariable;
	static int integerVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;

	public static void main(String[] args) {
		
		
		System.out.println("Byte Value: "+ byteVariable);
	
		
		System.out.println("Short Value: " + shortVariable);
		
		
		System.out.println("int Value: " + integerVariable);
		
		
		System.out.println("Long Value: " + longVariable);
		
		
		System.out.println("Float Value = " + floatVariable);
		

		
		System.out.println("double value = " + doubleVariable);
		
		
		System.out.println("Boolean value = " + booleanVariable);
		
		
		System.out.println("char Value = " + charVariable);

	}
	
	//anything here is considered outside of the 'main' method and will not work

}
