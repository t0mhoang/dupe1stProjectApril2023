package MethodOverloadOverride;

//type 3 is the difference in data type of arguments

public class CarsOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		increaseSeatHeight("2", 2);
		increaseSeatHeight(2, "2");
		
	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}
	public static void increaseSeatHeight(int variable2, String variable1) {
		System.out.println("I am the 2nd overload.");
	}


}
