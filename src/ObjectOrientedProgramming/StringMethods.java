package ObjectOrientedProgramming;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is the test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = " Spaces all around     ";
		String str6 = "Hello";
		
		System.out.println(str.length());//length of the string
		System.out.println(str.charAt(2));//returns character at specified index.. this line will read "i"
		System.out.println(str.concat(". This is the appended string"));//it appends.. or add onto the original string
		System.out.println(str.contains("is"));//is the boolean to find out if it contains what we are looking for in the string
		System.out.println(str.startsWith("This"));//also boolean as contains but makes sure it starts with
		System.out.println(str.endsWith("string"));//same as startsWith except this one is endsWith
		System.out.println(str1.equals(str2));//this a boolean that compares two contents
		
		System.out.println(str.indexOf('h'));//this line gives us index of given variable object
		System.out.println(str.isEmpty());//this line lets us know if the line is empty..if we used str4 it would be true
		System.out.println(str5.trim());//trim will trim all spaces from the front and back
		
System.out.println(str6.replace('e', 'a'));//this line will replace the old character with new character... this example changes hello to hallo
		System.out.println(str.substring(5));//this line will output from 5th index onwards
		System.out.println(str.substring(5, 10));//this line will start from 5th index onward and cut off at 10th index
		System.out.println(str.toLowerCase());//converts all characters into lowercase
		System.out.println(str.toUpperCase());//converts all characters into uppercase
		
		char[] charArray = str.toCharArray();//toCharArray converts string into character array... must use for loop
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		
		

	}

}
