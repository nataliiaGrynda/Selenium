package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;
public class _04_Locator {
  public static void main(String[] args) {
    /*
TEST CASE:
1. Go to https://www.google.com/
2. Validate the Google Image is displayed on the top of the search input box
 */

  // 1. set driver
    WebDriver driver = Driver.getDriver();

    //2. validation
    driver.get("https://www.google.com/");

  //make sure that image is displayed
    WebElement googleImage = driver.findElement(By.className("lnXdpd"));

  // check if it is displayed or not

   if(googleImage.isDisplayed()) System.out.println("Google image validation is PASSED");
   else System.out.println("Google image validation is Failed");


   // 3. teardown
    Driver.quitDriver();

  }
}
