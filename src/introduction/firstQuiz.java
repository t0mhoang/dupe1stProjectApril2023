package introduction;

public class firstQuiz {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		String c = a + " " + b;
		String c1 = a.concat(" ") + b;
		String c2 = a + b;// this one does not provide a space... so it is incorrect
		System.out.println(c2);
		
		String a1 = "This is a test string";
		System.out.println(a1.substring(1, 9));//this should print out "his is a" because from index 9 is where it is cut out
		
		String a2 = "I love Java";
		String output = a2.substring(7);
		String output2 = a2.substring(7, 11);
		//the two following syso with output "Java"
		System.out.println(output);
		System.out.println(output2);
		
		
		

	}

}
