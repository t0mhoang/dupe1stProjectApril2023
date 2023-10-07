package introduction;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//to make an array you will need [] box

		//long way to write array, using integers
		int[] myIntArray1;
		myIntArray1 = new int[10];//the 10 will give us 10 integers in the array index
		
		myIntArray1[0] = 100;//this is the first index
		myIntArray1[1] = 90;//this is the second index
		
		System.out.println("0 index: " + myIntArray1[0]);
		System.out.println("1st index: " + myIntArray1[1]);
		System.out.println("2nd index: " + myIntArray1[2]);//we didnt give a value to 3rd index so it initializes default value = 0
		
		
		//organized way to write array, using Strings
		String[] myStringArray1 = {"bmw", "audi", "honda"};
		System.out.println("0 index: " + myStringArray1[0]);
		System.out.println("1st index: " + myStringArray1[1]);
		System.out.println("2nd index: " + myStringArray1[2]);
		
		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;
		
		System.out.println("Int array length: " + len1);
		System.out.println("String array length: " + len2);
		
		for (int i = 0; i < len1; i++) {
			System.out.println(myIntArray1[i]);
		}
		
		Arrays.sort(myIntArray1);//this is will sort arrays into accending order
		
		for (int i = 0; i < len1; i++) {
			System.out.println(myIntArray1[i]);
		}
		
		
	}

}
