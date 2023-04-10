import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome"; // Static variable
    static WebDriver driver; // Storing WebDriver object to variable

    public static void main(String[] args) {
        // Nested if else opening correct browser dependent on user choice
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Incorrect Browser Name");
        }
        driver.get(" https://www.saucedemo.com/"); // Opening provided url in Chrome Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Telling browser to wait implicitly
        System.out.println(driver.getTitle()); // Get title of the web page
        System.out.println("The current URL of the page is: " + driver.getCurrentUrl()); // Getting and printing current url of the page
        System.out.println("The Page source is: " + driver.getPageSource()); // Getting and printing current page source
        driver.findElement(By.id("user-name")).sendKeys("maulin1@gmail.com"); // Finding username field with id Locator and passing value to put into email field
        driver.findElement(By.id("password")).sendKeys("12345"); // // Finding password field with id Locator and passing value to put into password field
        driver.close(); // Close the browser
    }
}
