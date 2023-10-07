package Excercises;

public class methodExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findGrades("Tom", 90);
		findGrades("John", 89);
		
	}
	
	public static void findGrades(String studentName, int score) {
		String grade;
		if(score >=90 && score <=100) {
			grade = "A";
		}else if (score >=80 && score <=89) {
			grade = "B";
		}else{
			grade = "C";
		}
		System.out.println("Student: " + studentName + ". Grade: " + grade);
	}
	

}
