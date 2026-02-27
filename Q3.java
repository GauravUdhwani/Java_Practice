package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Open first window
        driver.get("https://www.google.com");

        // Store parent window ID
        String parentWindow = driver.getWindowHandle();

        // Open second window
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
        driver.get("https://www.selenium.dev");

        // Get all window IDs
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                driver.close();   // Close only second window
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentWindow);

        System.out.println("Only child window closed successfully");

        driver.quit();

	}

}
