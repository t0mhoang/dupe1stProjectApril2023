package StaticPackage;

public class StaticDemoClass {
	private static int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;//when using static keyword it gets called from every class, try this with StaticDemo class to see outcome of having static keyword and without having static keyword
	
	public StaticDemoClass(String make) {
		this.make = make;
		instanceNum++;//this code will increase increment of instanceNum in StaticDemo class
	}
	
	public String getMake() {
		return make;
	}
	
	public int getInstanceNum() {
		return instanceNum;
	}
	
	public int getWheelsCount() {
		return wheelsCount;
	}
	
}
