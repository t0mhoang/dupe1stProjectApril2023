package introduction;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		//adding element to list by using add
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		//Size
		int size = cars.size();//to get size of list
		System.out.println("The size of the list is: " + size);
		
		//Get
		System.out.println("The item on the index 1 is: " + cars.get(1));//this will get item in the index
		
		//Iteration
		System.out.println("Iteration example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
		System.out.println("Next for loop example");
		for(String car : cars)//looking for type of car in cars 
		{
			System.out.println("The item is: " + car);
		}
		
		//remove
		cars.remove(size - 1);//this will remove the first index... remember index start with 0
		System.out.println("Next for loop example after removing");
		for(String car : cars)
		{
			System.out.println("The item is: " + car);
		}

	}

}
