package ObjectOrientedProgramming;

public class ClassDemo {
	/////////////getter and setter for class "Car"

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());

		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println(benz.getMake());
		
		benz.setModel("c300");
		System.out.println(benz.getModel());
		
		benz.setYear(1889);
		System.out.println(benz.getYear());
	}

}
