package ObjectOrientedProgramming;

public class ClassDemo2 {

	public static void main(String[] args) {
		/////////////Getter and setters for classes "Car" and "ClassDemo"
		
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println("Make of Beamer is: " + bmw.getMake());
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Make of Mercedes is: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of benz is: " + benz.getModel());
		
		benz.setYear(2020);
		System.out.println("Year of Benz is: " + benz.getYear());

	}

}
