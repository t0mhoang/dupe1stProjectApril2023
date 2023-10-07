package ConditionalStatementsNLoops;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		boolean condition = i < 20;
		
		while (condition) {
			if(i == 17) {
				break;//if adding this code line in the while loop then it will print until it hits 17, if not it will print until 20 as stated
			}
			System.out.println(i);
			i++;
		}
		System.out.println("outside of loop...");
	}

}
