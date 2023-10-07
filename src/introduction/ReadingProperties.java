package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\TOM\\eclipse-workspace\\JavaTutorial\\src\\introduction\\test.properties";

		Properties prop = new Properties();
FileInputStream fs = new FileInputStream(path);//must create file in same package and MUST save file with '.properties' extention in name


		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
	}

}
