package ObjectOrientedProgramming;


////////////////////getter and setter for class "ClassDemo"
public class Car {
	//below is Contructor
	int speed;
	int gear;
	
	public Car() {
		//it is possible to call a constructor into another contructor using "this" argument
		//example on this line code would be "this(10,2)" and it would call second constructor before calling this constructor
		//but because speed and gear defined in this constructor speed and gear would still be 0
		speed = 0;
		gear = 0;
		System.out.println("Executing constructor without arguments");
	}//here ends the first constructor
	
	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("executing constructor with arguements");
	}//here ends the second constructor
	
	//from here down is code for Car class
	//color
	private String color;
	//make
	private String make;
	//model
	private String model;
	//year
	private int year;
	
	public void increaseSpeed() {
		System.out.println("Increasing the Speed");
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1900) {
			this.year = year;
		}else if (year >= 1880 && year <=1899) {
			System.out.println(year + ". This year is almost out of date");
		}
		else {
			System.out.println("This year is not valid");
		}
	}
}
