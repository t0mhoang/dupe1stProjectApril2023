package introduction;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Stores in pair, key -> value: Entry

		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "BMW");
		map.put(7, "Audi");
		map.put(4, "Honda");
		
		String value1 = map.get(2);
		System.out.println(value1);
		
		//Keys are unique, value can be duplicated
		map.put(2, "BMW");
		String value2 = map.get(2);
		System.out.println(value2);
		
	}

}
