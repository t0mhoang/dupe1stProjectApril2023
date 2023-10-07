package introduction;

public class stringDemo {


	public static void main(String[] args) {
		
		//String literal = String constant pool
		String str1 = "hello";//this style uses the original object instead of creating a brand new one
		System.out.println(str1);
		
		// String object = heap
		String str2 = new String("Welcome");//this style creates brand new object
		System.out.println(str2);

	}

}
