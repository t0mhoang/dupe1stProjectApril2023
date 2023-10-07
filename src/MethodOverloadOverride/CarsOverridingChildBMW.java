package MethodOverloadOverride;

/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */


public class CarsOverridingChildBMW extends CarsOverridingParent {

	public static void main(String[] args) {
		
		CarsOverridingParent c1 = new CarsOverridingChildBMW();//we are creating object from parent to child class
	//CarsOverridingChildBMW c2 = new CarsOverridingChildBMW(); this will be child class calling objects from parent into its own class
		c1.increaseSpeed();
		c1.engineStart(2);

	}
	
	@Override
	public void engineStart(int cyl) {
		super.engineStart(2);//super keyword will call directly from parent
		System.out.println("I am from child class");
	}
	
	public static void staticExample() {//this is rule number 3. using super keyword will not pull this method from parent class
		System.out.println("i am the static method from child");
	}
}
