package test;

import com.sun.deploy.util.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class TestFacebook {
  public static void main(String[] args) {

/*
Go to https://www.facebook.com/
2. Validate the title of the page is “Facebook - Log In or Sign
Up”
3. Validate the URL of the page is “https://www.facebook.com/”
4. Validate “facebook” logo is displayed
5. Validate heading2 “Connect with friends and the world
around you on Facebook.” is displayed
6. Validate “Email or Phone Number” input box is
displayed
7. Validate “Password” input box is displayed
8. Validate “Log In” button is displayed and enabled
9. Validate “Forgot Password?” link is displayed
10. Validate "Create new account" button is displayed
 */
    WebDriver driver = Driver.getDriver();
    driver.get("https://www.facebook.com/");

    String logInSignUpTitle = driver.getTitle();
    String urlOfThePage = driver.getCurrentUrl();
    WebElement facebookLogo = driver.findElement(By.className("_8ilh"));
    WebElement facebookHeading2 = driver.findElement(By.className("_8eso"));
    WebElement emailOrPhoneNumberInputBox = driver.findElement(By.id("email"));
    WebElement passwordInputBox = driver.findElement(By.id("pass"));
    WebElement loginButton = driver.findElement(By.name("login"));
    WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
    WebElement createNewAccountButton = driver.findElement(By.cssSelector("button"));

    if(logInSignUpTitle.equals("Facebook - Log In or Sign Up")) System.out.println("logInSignUpTitle validation PASSED");
    else System.out.println("logInSignUpTitle validation is Failed");

    if(urlOfThePage.equals("https://www.facebook.com/")) System.out.println("urlOfThePage validation PASSED");
    else System.out.println("urlOfThePage validation is Failed");

    if (facebookLogo.isDisplayed()) System.out.println("The facebookLogo validation PASSED");
    else System.out.println("FaceBookLogo validation is Failed");

    if (facebookHeading2.isDisplayed()) System.out.println("The facebookHeading2 validation PASSED");
    else System.out.println("facebookHeading2 validation is Failed");

    if (emailOrPhoneNumberInputBox.isDisplayed())
      System.out.println("The emailOrPhoneNumberInputBox validation PASSED");
    else System.out.println("emailOrPhoneNumberInputBox validation is Failed");

    if (passwordInputBox.isDisplayed()) System.out.println("The passwordInputBox validation PASSED");
    else System.out.println("passwordInputBox validation is Failed");

    if (loginButton.isDisplayed()) System.out.println("The loginButton validation PASSED");
    else System.out.println("loginButton validation is Failed");

    if (forgotPasswordLink.isDisplayed()) System.out.println("The forgotPasswordLink validation PASSED");
    else System.out.println("forgotPasswordLink validation is Failed");

    if (createNewAccountButton.isDisplayed()) System.out.println("The createNewAccountButton validation PASSED");
    else System.out.println("createNewAccountButton validation is Failed");

    Driver.quitDriver();


  }
}
