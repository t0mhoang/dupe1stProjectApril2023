package Excercises;

public class BackwardString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = "Tom";
		String s = "";
		for (int i = t.length()-1;i>=0;i--)
		{
			s = s + t.charAt(i);
		}
			System.out.println(s);

		
	}

}
