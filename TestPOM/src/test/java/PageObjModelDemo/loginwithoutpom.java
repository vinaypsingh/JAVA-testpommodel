package PageObjModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginwithoutpom {

	public static void main(String[] args) {


		// Launch Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open url
		driver.get("https://www.saucedemo.com/v1/");
		
		//
//		find all the elements
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}

}
