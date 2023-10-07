package ObjectOrientedProgramming;

public class addingMethods {

	public static void main(String[] args) {
		String grade;//we have to create this because we used "return" inside the method
		String studentName;
		
		displayGrades("Tom" , "A");
		
		//or to make more sense you would use code from lines 13-15
		
		studentName = "John";
		grade = findGrades(80);
		displayGrades(studentName, grade);
		
	}
	
	public static String findGrades(int score) {
		String grade;
		if (score >= 90 && score <=100) {
			grade = "A";
		} else if (score >=80 && score <90) {
			grade = "B";
		}else if (score >=70 && score <80) {
			grade = "c";
		}else {
			grade = "D";
		}
	return grade;//when returning variable then the we have to return same method variable... see method is "public static STRING findGrades"
	}
	
	public static void displayGrades(String studentName, String grade) {
		System.out.println("********************");
		System.out.println("Grade of " + studentName + " is: " + grade);
		System.out.println("********************");
	}

}
