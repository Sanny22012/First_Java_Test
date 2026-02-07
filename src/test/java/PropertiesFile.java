import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertesFile();
		Test.browser = prop.getProperty("browser");
		System.out.println(Test.browser);
	}
	
	public static void readPropertiesFile() {
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\sanny\\eclipse-workspace\\Selenium\\src\\test\\java\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writePropertesFile() {
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\sanny\\eclipse-workspace\\Selenium\\src\\test\\java\\config.properties");
			prop.setProperty("browser","Firefox");
			prop.setProperty("result","pass");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
