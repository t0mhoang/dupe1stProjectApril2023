package MethodOverloadOverride;

//1. Number of parameters could be different
//2. Data type of parameters are different
//3. Sequence of data type is different
//4. Cannot overload just on return type... see how second method return type got changed from static void to static int because-
//we used return in the code
public class CarsOverloadingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}
	public static int increaseSeatHeight(String variabl1, String variable2) {
		System.out.println("I am the 2nd overload.");
		return 0;
	}
	

}
