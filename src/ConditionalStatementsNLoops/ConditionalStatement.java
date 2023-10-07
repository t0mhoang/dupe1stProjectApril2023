package ConditionalStatementsNLoops;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1 = 10;
		int val2 = 10;
		
		boolean condition = val1 == val2;
		//System.out.println(condition);
		
		if (val1 == val2) {
			System.out.println("Condition is " + condition);
		}else
			System.out.println("Condition is " + condition);


		int score = 91;
		String grade;
		
		if(score > 90) {
			grade = "A";
		}else if (score > 80){
			grade = "B";
		}else {
			grade = "C";
	    }
		System.out.println("Grade is " + grade);
	}

}
