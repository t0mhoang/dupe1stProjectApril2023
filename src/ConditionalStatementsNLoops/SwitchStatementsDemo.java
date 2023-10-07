package ConditionalStatementsNLoops;

public class SwitchStatementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numDays = numOfDays(2000, 1);
		System.out.println("Number of Days in given year and month are: " + numDays);

	}
	
	static int numOfDays(int year, int month) {
		int numDays = 0;
		
		switch(month) {
		case 1:
			//month = 1; this line is not needed because it is already placed in argument/value when calling numOfDays code
			numDays = 31;
			break;
			
		case 2:
			
			if(year % 400 ==0) {
				numDays = 29;
			}
		 else {
			numDays = 28;
		}
			break;
		case 3:
			numDays = 31;
			break;
		case 4:
			numDays = 30;
			break;
		case 5:
			numDays = 31;
			break;
		case 6:
			numDays = 30;
			break;
		case 7:
			numDays = 31;
			break;
		case 8:
			numDays = 31;
			break;
		case 9:
			numDays = 30;
			break;
		case 10:
			numDays = 31;
			break;
		case 11:
			numDays = 30;
			break;
		case 12:
			numDays = 31;
			break;
		
		default: 
			System.out.println("Invalid Month");
			break;
		}
		return numDays;
	}

}
