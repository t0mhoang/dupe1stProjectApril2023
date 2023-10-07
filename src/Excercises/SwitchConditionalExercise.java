package Excercises;

public class SwitchConditionalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numDays = numOfDays(2000, 1);
		System.out.println(numDays);

	}
	
	static int numOfDays(int year, int month) {
		int numDays = 0;
		
		switch (month) {
		case 1:
			numDays = 31;
			break;
		case 2:
			if(year % 400 ==0) {
				numDays = 29;
			}else
				numDays = 28;
			break;
		case 3:
			numDays = 31;
		}
		return numDays;
	}

}
