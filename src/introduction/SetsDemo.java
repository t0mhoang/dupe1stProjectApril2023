package introduction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Types of sets
 * 1. hashset - will randomize sorting order
 * 2. LinkedHashSet - maintains order as it was added
 * 3. TreeSet - maintains natural sorting order example: 1,2,3,a,b,c
 */
public class SetsDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();// hash set will automatically randomize order
		
		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Honda");
		
		System.out.println(set);
		//set only stores unique elements
		
		
		//this forloop will iterate over the set items
		for(String item: set) {
			System.out.println(item);
		}
		
		List<String> list = new ArrayList<String>();
		
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		list.add("Honda");

		System.out.println(list);
	}

}
