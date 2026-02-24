package Selenium_1stProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondProject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\gaura\\Selenium_Project\\chromedriver-win64\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.microsoft.com/en-us/edge/welcome?form=MT00LJ&cs=1851577920&esf=1");
		
		// TODO Auto-generated method stub

	}

}
