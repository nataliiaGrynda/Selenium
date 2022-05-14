package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
  public static void main(String[] args) throws InterruptedException {
    //1. set up driver
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\roman\\IdeaProjects\\selenium_intro\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();// instantiate a Chrome Driver
    //2. maximize driver
    driver.manage().window().maximize();// maximize the driver

    //3 implicit waits define
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    //4 navigate to google web site
      driver.get("https://www.google.com");

    // 5. validate the title is google
    System.out.println("the title of the page is = " + driver.getTitle());
    if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
    else System.out.println("Google title validation FAILED ");

    System.out.println("End of the program");

    //6. Quit driver
    Thread.sleep(3000);// wait for demo purpose
    driver.quit();
  }
}
