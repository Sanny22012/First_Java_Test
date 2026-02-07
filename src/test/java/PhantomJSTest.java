import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	public static void main(String[] args) {
		
		System.setProperty("phantomjs.binary.path", "C:/SeleniumDrivers/phantomjs.exe/");
		
		PhantomJSDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		driver.quit();
	}

}
