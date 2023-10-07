package ConditionalStatementsNLoops;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for( int i = 0; i < 10; i++) {
//			//for (initialization happens the first time and only once; Boolean_expression checks for condition; Update increment/decrement)
//			System.out.println("Value of i: " + i);
//		}
		
		int[] numbers = {10, 20, 30};
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println("The value of index " + i + " is: " + numbers[i]);
//		}
		
		//or a better way to code the code above is like this:
		
		for (int number: numbers) {
			System.out.println("The value is: " + number);
		}
		
		String[] cars = {"bmw", "audi", "honda"};
		for (String car: cars) {
			System.out.println(car);
				
		}
	}

}
