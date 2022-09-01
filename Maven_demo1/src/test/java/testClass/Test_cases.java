package testClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClass.PageClasses;
import PageClass.Webcommons;

public class Test_cases {

	  WebDriver driver;
static Properties pp =new Properties();

@Test
public void  excuteTest() throws IOException, InterruptedException {
	
	
	 driver=Webcommons.web();
	 FileInputStream fs =new FileInputStream("Demo.properties");
	 pp.load(fs);

	 String s=pp.getProperty("URL");
	 driver.get(s);}



@Test
	 public void excute_reg() throws InterruptedException {
	 
	 
	 PageClasses pg=PageFactory.initElements(driver,PageClasses.class );
	 
	pg.regiration(pp.getProperty("Fnam"),pp.getProperty("lastnam"), pp.getProperty("Emai"), pp.getProperty("PassWor"), pp.getProperty("resetPassWor"));
}
}
