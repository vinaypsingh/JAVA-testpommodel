package welloSolutionPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePageTest {
	
	// Launch WebDriver
	WebDriver driver;
	
	// Constructor
	HomePageTest(WebDriver d)
	{
		driver =d;
	}
	
	//Locate webelements
	
	By Solutions=By.linkText("Solutions");
	By Industry=By.linkText("Industry");
	By Integrations =By.linkText("Integrations ");
	
	public void cickSolution() {
		driver.findElement(Solutions).click();
	}
	
	public void cickindustry() {
		driver.findElement(Industry).click();
	}
	public void cickIntegration() {
		driver.findElement(Integrations).click();
	}
	

}
