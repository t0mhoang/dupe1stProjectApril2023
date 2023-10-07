package JavaInterviewQuestions;

public class reverseString {

	public static void main(String[] args) {
	
		/***
		 * Possible interview questions
		 * 1. Reverse a String
		 * 2. What is the difference between a String and StringBuffer?
		 * 3. Do we have the reverse function in a String?
		 */
		
		//solution 1
		
		String s = "Selenium";//String is immutable
		String rev = "";
		int len = s.length();
		
		for(int i = len -1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//solution 2
		
		StringBuffer sf = new StringBuffer(s);//StringBuffer is mutable so it has reverse function
		System.out.println(sf.reverse());
		
		
		

	}

}
