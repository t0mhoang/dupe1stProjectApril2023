package Excercises;

import java.util.Arrays;

public class ArrayExercises {
	
	public static void main(String[] args) {
		
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
		
		//then print out int arrays to system
		
		System.out.println("original numeric array: " + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array: " + Arrays.toString(my_array1));
		
		String[] stringArray = {"java", "python", "ruby", "C++", "C#"};
		
		System.out.println("Original String array: " + Arrays.toString(stringArray));
		Arrays.sort(stringArray);
		System.out.println("Sorted String array: " + Arrays.toString(stringArray));
	}

}
