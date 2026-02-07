import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static String browser;
	static WebDriver driver;
	
	public static void main(String[] arg) {
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertesFile();
	}
	
	
	public static void setBrowser() {
		browser="Chrome";
	}
	
	public static void setBrowserConfig() {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	public static void runTest() {

		driver.get("https://sarkariresult.com");
		
		driver.quit();
	}

}
