package PageObjModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
	
	
	public static void main(String[] args) {
		
		//Launch driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage LoginPg= new LoginPage(driver);
		
		
		//open url
		driver.get("https://www.saucedemo.com/v1/");
		
		
		LoginPg.enterUsername("standard_user");
		LoginPg.enterPassword("secret_sauce");
		LoginPg.clickLoginBtn();
		
	}
}
