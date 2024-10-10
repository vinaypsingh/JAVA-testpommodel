package PageObjModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using PageFactory
public class LoginPage2 {

	// creating driver object
	WebDriver driver;

	// Constructor
	LoginPage2(WebDriver d) {
		driver = d;
		
	//This method will create webelements
		PageFactory.initElements(driver, this);
	}

	// Identify webelements
	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void enterUsername(String Uname) {

		username.sendKeys("standard_user");

	}

	public void enterPassword(String Password) {
		password.sendKeys("secret_sauce");
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}