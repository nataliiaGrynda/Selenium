package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
  public static void main(String[] args) throws InterruptedException {
    //1. set up driver// for second i will install the path first and copy it
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\roman\\IdeaProjects\\selenium_intro\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();// instantiate a Chrome Driver// where my executable browser is located

    //2. maximize driver
    driver.manage().window().maximize();// maximize the driver// and it is threadsafe
   // driver.manage().window().fullscreen();  we don't use it

    //3. implicit waits define
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// second argument comes as an enum, and it waits up to 30 seconds
    //if the element show ups in 5 sec it will stop and it will go to the next step, this is why we don't use Thread.sleep().

    //4. navigate to google web site or also called validations
      driver.get("https://www.google.com");//application url, will validate in dev or qa invairment


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
