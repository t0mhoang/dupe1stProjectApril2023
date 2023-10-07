package Excercises;

public class GetterSetter1 {
	
	private String model;
	private String make;
	private int year;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >= 1900) {
	}else if (year >=1880 && year <=1899) {
		this.year = year;
		System.out.println("This year is almost out of date");
	}else {
		System.out.println("this is an invalid year");
	}
	}

}
