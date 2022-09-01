package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DashBoard {
	WebDriver driver;
	public DashBoard(	WebDriver driver)
 {
	this.driver=driver;
	
	}
	@FindBy(how = How.XPATH,using ="//*[@class=\"button-1 register-continue-button\"]" )	
	WebElement continues;
	@FindBy(how = How.XPATH,using ="//*[@class=\"top-menu\"]//*[@href=\"/computers\"]" )	
	WebElement computer;
	@FindBy(how = How.XPATH,using ="//*[@alt=\"Picture for category Desktops\"]" )	
	WebElement desktop ;
	@FindBy(how = How.XPATH,using ="//*[@id=\"products-orderby\"]" )	
	WebElement sortby;
	@FindBy(how = How.XPATH,using ="//*[@alt=\"Picture of Build your own expensive computer\"]" )	
	WebElement Expansive;
	@FindBy(how = How.XPATH,using ="//*[@for=\"product_attribute_74_5_26_82\"]" )	
	WebElement Processerfast;
	@FindBy(how = How.XPATH,using ="//*[@id=\"product_attribute_74_6_27_85\"]" )	
	WebElement ram8;
	@FindBy(how = How.XPATH,using ="//*[@id=\"product_attribute_74_3_28_87\"]" )	
	WebElement hdd;
	@FindBy(how = How.XPATH,using ="//*[@id=\"product_attribute_74_8_29_90\"]" )
	WebElement softwarre;
	@FindBy(how = How.XPATH,using ="//*[@class=\"qty-input valid\"]" )	
	WebElement quantity;
	@FindBy(how = How.XPATH,using ="//*[@id=\"add-to-cart-button-74\"]" )	
	WebElement addtocart;
	
	public void selectPoisition() {
	Select st=new Select(sortby);
	st.selectByVisibleText("Price: Low to High");
	
	}
	public void Scrolling() {

		JavascriptExecutor js	=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

	}
	
	public void dashBoardMethod(String qty) {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		continues.click();
		computer.click();
		desktop.click();
		selectPoisition();
		Scrolling();
		Expansive.click();
		Processerfast.click();
		Scrolling();
		ram8.click();
		hdd.click();
		softwarre.click();
		quantity.click();
		quantity.clear();

		quantity.sendKeys(qty);
		addtocart.click();
		
		
		
	}
	
}

	




























