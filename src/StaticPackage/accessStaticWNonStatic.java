package StaticPackage;

public class accessStaticWNonStatic {

	//static and non static variables can not be used together
	//"this" and "super" keywords can not be used in static context
	
	public int addNum = 10;
	public static int addNumStatic = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessStaticWNonStatic s1 = new accessStaticWNonStatic();
		int output = s1.sum(20);//in order to use this line that is a non static method, we must create object like from line 13
		int staticOutput = sumStatic(10);
		System.out.println("this output is: " + output);
		System.out.println("this output is: " + staticOutput);

	}
	
	public int sum(int num) {
		return num + addNum; //this method will not work because it is not static like inside the main method... so create another method below
	}
	
	public static int sumStatic(int num) {
		return num + addNumStatic;//addNum did not have a static variable so created one on line 9 for this method to work
	}

}
