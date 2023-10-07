package ExceptionHandling;

import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args)  {
		// this class goes with Account class
		Account acc = new Account();
		
		try {
			acc.withdraw(100);//if we get this code to work then the try block will be executed
			System.out.println("this block will try the code");
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
			System.out.println("this block will catch the code if 'try' block doesnt execute");
		}
		finally {
			System.out.println("this syntax 'finally' always executes");
		}

	}

}
