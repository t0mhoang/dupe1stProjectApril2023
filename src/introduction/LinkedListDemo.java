package introduction;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

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

		////////////////////////////////////////////////////////
		//Array list - is a fast list when you have to add and/or remove from the end
		//Linked list - is when you have to add and/or remove from the beginning
		
		List<Integer> lList= new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();
		
		runDuration(aList, "Array list");
		runDuration(lList, "Linked list");
		
	}
	
	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\nBeginning of the duration method for " + listType);
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<200000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		for(int i = size; i < elementToAdd; i++) {
			list.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of the list " + listType + " is " + duration + " milsec");
	}
}







