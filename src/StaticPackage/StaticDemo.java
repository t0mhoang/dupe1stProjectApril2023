package StaticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		StaticDemoClass s1 = new StaticDemoClass("bmw");
		System.out.println("Make of car is: " + s1.getMake());
		System.out.println("This is instance number: " + s1.getInstanceNum());
		System.out.println("This is how many wheels this car has: " + s1.getWheelsCount());
	
		StaticDemoClass s2 = new StaticDemoClass("benz");
		System.out.println("Make of car is: " + s2.getMake());
		System.out.println("This is instance number: " + s2.getInstanceNum());
		System.out.println("This is how many wheels this car has: " + s2.getWheelsCount());
	
	}

}
