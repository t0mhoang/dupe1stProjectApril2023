package MethodOverloadOverride;

/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */

public class CarsOverridingParent {

	public void engineStart(int cyl) {
		System.out.println("I am from parent class");
	}
	
	public void increaseSpeed() {
		System.out.println("I am the increased speed from parent class");
	}
	
	public static void staticExample() {
		System.out.println("i am the static method from parent");
	}
}
