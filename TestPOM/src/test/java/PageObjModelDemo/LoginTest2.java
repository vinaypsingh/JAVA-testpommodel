package PageObjModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

	public static void main(String[] args) {
	
					//Launch driver
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				LoginPage2 LoginPg2= new LoginPage2(driver);
				
				
				//open url
				driver.get("https://www.saucedemo.com/v1/");
				
				
				LoginPg2.enterUsername("standard_user");
				LoginPg2.enterPassword("secret_sauce");
				LoginPg2.clickLoginBtn();
				
			}
}

