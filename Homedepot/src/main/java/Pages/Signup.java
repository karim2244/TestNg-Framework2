package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
public static WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"headerMyAccountTitle\"]/div") WebElement myaccount;
	@FindBy(xpath ="//*[@id=\"SPSORegister\"]/a/span") WebElement register;
	@FindBy(xpath ="//*[@id=\"single-signin__body\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[4]/button/span") WebElement select;
	@FindBy(xpath ="//*[@id=\"email\"]") WebElement email;
	@FindBy(xpath ="//*[@id=\"password-input-field\"]") WebElement password;
	@FindBy(xpath ="//*[@id=\"zipCode\"]") WebElement zipcode;
	@FindBy(xpath ="//*[@id=\"phone\"]") WebElement phone;
	@FindBy(xpath ="//*[@id=\"recaptcha-anchor\"]/div[1]") WebElement captcha;
	@FindBy(xpath ="//*[@class = 'bttn__content']") WebElement accountclick;
	
	public Signup(WebDriver driver) {
		Signup.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void myaccountclick() {
		myaccount.click();
	}
	public void registerclick() {
		register.click();
	}
	public void selectclick() {
		select.click();
	}
	public void emailfield(String emailtxt) {
		email.clear();
		email.sendKeys(emailtxt);
	}
	public void passfield(String passtxt) {
		password.clear();
		password.sendKeys(passtxt);
	}
	public void zip(String ziptxt) {
		zipcode.clear();
		zipcode.sendKeys(ziptxt);
	}
	public void phonenumber(String phonetxt) {
		phone.clear();
		phone.sendKeys(phonetxt);
	}
	public void createanaccount() {
		accountclick.click();
	}
	
}
