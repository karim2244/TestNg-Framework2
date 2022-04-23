package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commoncode.baseclass;

public class fbhome {
public static WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"email\"]") WebElement email;
	@FindBy(xpath ="//*[@id=\"pass\"]") WebElement pass;
	@FindBy(xpath ="//*[@name='login']") WebElement clickbutton;
	
	public fbhome(WebDriver driver) {
		fbhome.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void emailfield(String emailtxt) {
		email.clear();
		email.sendKeys(emailtxt);
	}
		public void passfield(String passtxt) {
			pass.clear();
			pass.sendKeys(passtxt);
    }
		public void login() {
			clickbutton.click();
			
}
}