package introduction;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "This is the test string";
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "welcome";
		String str4 = "";
		String str5 =  "       spaces all around      ";
		String str6 = "Hallo";
		
		System.out.println("Length of the string is: " + str.length());
		System.out.println("Character of the string is: " + str.charAt(2));
		System.out.println(str.concat(" This is the appended string"));
		System.out.println("contains check 1: " + str.contains("is"));
		System.out.println("contains check 2: " + str.contains("si"));
		System.out.println("starts with check 1: " + str.startsWith("This"));
		System.out.println("starts with check 2: " + str.startsWith("is"));
		System.out.println("ends with check 1: " + str.endsWith("string"));
		System.out.println("ends with check 2: " + str.endsWith("that"));
		System.out.println("check contents are equal: " + str.equals(str1));
		System.out.println("check contents are equal: " + str.equals(str2));	
		System.out.println("index of 'h' is: " + str.indexOf('h'));
		System.out.println("Check if string is empty 1: " + str4.isEmpty());
		System.out.println("Check if string is empty 2: " + str5.trim());
		System.out.println("replace Example: " + str6.replace('a', 'e'));
		System.out.println("substring example from 5th index: " + str.substring(5)); 
		System.out.println("Substring example starting from 5th index and end on 10th index: " + str.substring(5, 10));
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
		

	}

}
