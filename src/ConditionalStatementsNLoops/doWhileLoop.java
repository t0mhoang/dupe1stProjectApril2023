package ConditionalStatementsNLoops;

public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		do {//the "do" keyword will alway run the first iteration even if it wasnt true... example replace the 20 in the while loop with 10
			System.out.println(i);
			i++;
		} while (i <20);//while loop will only execute what is true
		
	}

}
