package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class MyPersonalPractice {
  public static void main(String[] args) throws InterruptedException {
/*
/*
Go to https://www.google.com/
Validate the links below at the bottom-left of the page
Advertising
Business
How Search works
 */


    WebDriver driver = Driver.getDriver();

//    driver.get("https://www.google.com/");
//
//    List<WebElement> links = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));
//    String[] expectedLinks = {"Advertising", "Business", "How Search works"};
//
//    for (int i = 0; i < 3; i++) {
//      if (links.get(i).isDisplayed() && links.get(i).isEnabled() && links.get(i).getText().equals(expectedLinks[i]))
//      System.out.println("passed");
//
//    else System.out.println("failed");
//      }
    driver.get("https://www.google.com/");

//    WebElement image = driver.findElement(By.linkText("Images"));
//    WebElement gmailButton = driver.findElement(By.linkText("Gmail"));
//    WebElement about = driver.findElement(By.linkText("About"));
//    WebElement storeLocator = driver.findElement(By.linkText("Store"));

    List<WebElement> listOfLinks = driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));

    for (int i = 0; i <= 3 ; i++) {
      System.out.println(listOfLinks.get(i).getText());
      System.out.println(listOfLinks.get(i).isDisplayed()&& listOfLinks.get(i).isEnabled()? "PASSED": "FAILED") ;


    }





   driver.quit();
    }
  }



