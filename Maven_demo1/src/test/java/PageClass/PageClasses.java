package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClasses {
	WebDriver driver;
	public PageClasses(	WebDriver driver)
 {
	this.driver=driver;
	
	}
@FindBy(how = How.XPATH,using ="//*[@class=\"ico-register\"]" )	
WebElement regicon;
@FindBy(how = How.XPATH,using ="//*[@id=\"gender-male\"]" )	
WebElement genm;
@FindBy(how = How.XPATH,using ="//input[@data-val-required=\"First name is required.\"]" )	
WebElement Fname;
@FindBy(how = How.XPATH,using ="//*[@id=\"LastName\"]" )	
WebElement lastname;
@FindBy(how = How.XPATH,using ="//*[@data-val-email=\"Wrong email\"]" )	
WebElement Email;
@FindBy(how = How.XPATH,using ="//*[@name=\"Password\"]" )	
WebElement PassWord;
@FindBy(how = How.XPATH,using ="//*[@id=\"ConfirmPassword\"]" )	
WebElement resetPassWord;
@FindBy(how = How.XPATH,using ="//*[@name=\"register-button\"]" )	
WebElement rebutton;


	public void regiration(String Fnam, String lastnam, String Emai, String PassWor,String resetPassWor) throws InterruptedException {
		regicon.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		genm.click();
		Thread.sleep(2000);
		Fname.sendKeys(Fnam);
		lastname.sendKeys(lastnam);
		Email.sendKeys(Emai);
		PassWord.sendKeys(PassWor);
		resetPassWord.sendKeys(resetPassWor);
		//rebutton.click();
	}



	
}

