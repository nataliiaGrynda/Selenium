package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class _01_Validate_Apple_Title {
  public static void main(String[] args) {


/*
TEST CASE
1. Go to "https://www.apple.com/"
2. Validate the title of the page is displayed as "Apple"
 */
    WebDriver driver = Driver.getDriver();
/*
    System.setProperty("webdriver.chrome.driver", "C:\\" +
       "Users\\roman\\IdeaProjects\\selenium_intro\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
*/
   driver.get("https://www.apple.com");

    String expectedTitle = "Apple";
    String actualTitle = driver.getTitle();

   // System.out.println("The title of the page is = " + driver.getTitle());
//    if(driver.getTitle().equals("Apple")) System.out.println("Apple title validation PASSED");
//    else System.out.println("Apple title validation FAILED ");



      driver.quit();






  }
}
