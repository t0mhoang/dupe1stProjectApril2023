package Excercises;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "This is a string";
		String output = reverse(input);
		System.out.println(output);
		
	}
	
	private static String reverse(String input) {
		String reverse = "";
		
		if(input.isEmpty() || input == null) {
			System.out.println("String is empty");
		}
		
		if(input.length() <=1) {
			reverse = input;
		}else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) {
				reverse = item + " " + reverse;
			}
			
			
		}
		
		return reverse;

	}
}
