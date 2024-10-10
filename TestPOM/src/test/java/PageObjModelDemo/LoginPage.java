package PageObjModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginPage{
	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver d) {
		
		driver = d;
		
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By LoginButton = By.id("login-button");
	
	public void enterUsername(String Uname) {
		
		driver.findElement(username).sendKeys("standard_user");
		
	}
	
	public void enterPassword(String Password) {
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	public void clickLoginBtn() {
		driver.findElement(LoginButton).click();
	}
	
	
	
	
	
	
}