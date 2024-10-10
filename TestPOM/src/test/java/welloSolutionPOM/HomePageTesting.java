package welloSolutionPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePageTesting {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		HomePageTest Homepg=new HomePageTest(driver);
		
		//open URL
		driver.get("https://wello.solutions/");
		
		Homepg.cickSolution();
		Homepg.cickIntegration();
		Homepg.cickindustry();
		
		driver.quit();
		
				
		

	}

}
