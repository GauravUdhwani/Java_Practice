package Selenium_1stProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstProject {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\Selenium_Project\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// TODO Auto-generated method stub

	}

}
