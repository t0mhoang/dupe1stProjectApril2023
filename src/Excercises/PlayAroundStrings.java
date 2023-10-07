package Excercises;

public class PlayAroundStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//make output print "Java"
		String a = "I love Java";
		//String output = a.substring(7, 11);
		String output = a.substring(8, 11);
		System.out.println(output);
		
	    String t = "Tom";
	    String s = "";
	    for(int i = t.length()-1; i >=0; i--) {
	    	s = s + t.charAt(i);
	    }
		System.out.println(s);
		
		
		
	}

}
