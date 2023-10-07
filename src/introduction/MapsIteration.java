package introduction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "BMW");
		hashMap.put(7, "Audi");
		hashMap.put(4, "Honda");
		
		System.out.println("Iteration 1");
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
		
		System.out.println("Iteration 2");
		for(Integer key: hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
		
		//linked maintains order
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		hashMap.put(1, "BMW");
		hashMap.put(7, "Audi");
		hashMap.put(4, "Honda");
		
		System.out.println("Iteration 3");
		for(Integer key: linkedMap.keySet()) {
			String value = linkedMap.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
		
		//tree maintains natural sorting order
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		hashMap.put(1, "BMW");
		hashMap.put(7, "Audi");
		hashMap.put(4, "Honda");
		System.out.println("Iteration 4");
		for(Integer key: treeMap.keySet()) {
			String value = treeMap.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}

	}

}
