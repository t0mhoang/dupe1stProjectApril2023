package MethodOverloadOverride;

//type 2 is difference in data type of arguments

public class CarsOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		increaseSeatHeight(2);
		increaseSeatHeight("8");
	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + "inches. I am the interger 1");
	}
	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + "inches. I am the String 1");
	}

}
