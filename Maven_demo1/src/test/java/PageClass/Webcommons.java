package PageClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webcommons {
	static WebDriver driver;
	public static WebDriver web() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayatri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return driver;

}
}