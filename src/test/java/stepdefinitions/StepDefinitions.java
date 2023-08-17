package stepdefinitions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    AndroidDriver driver;
    @Given("^User enters the desired capabilities$")
    public void desiredCap() throws MalformedURLException {
        // try and catch block to handle the exceptions
        try{
            // use class DesiredCapabilities to pass the desired capabilities to receive a session id
            DesiredCapabilities dc = new DesiredCapabilities();
            // set automation name =  Appium
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            // set device name = Android Emulator (Emulator is a virtual device for the android)
            dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
            // set platform name = Android
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            // set the app = location of the .apk file in your pc
            dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\divjot.kaur\\Downloads\\ExpenseAppVer1.0 (1).apk");

            // set the url where remote host = 127.0.0.1 , remote port = 4723, remote path = /wd/hub
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            // create an object of android driver and pass url and desired capabilities
            driver = new AndroidDriver(url, dc);
            // provide the implicit wait for 20 seconds
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        // handles the exception
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    @When("^User clicks on signup button$")
    public void signUp(){
        // provide try and catch block to handle the exception
        try{
            // click on the signup button
            MobileElement element = (MobileElement) driver.findElement(Locators.signup);
            element.click();
        }
        // handles the exception
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }

    @And("User enters the data in the signup window")
    public void enterData(){
        // provide try and catch block to handle the exception
        try{
            // create class Locators and store the id of all the elements
            // enter the name using send keys
            MobileElement name = (MobileElement) driver.findElement(Locators.name);
            name.sendKeys("Divjot kaur");

            // enter the email using send keys
            MobileElement email = (MobileElement) driver.findElement(Locators.email);
            email.sendKeys("divjot123@gmail.com");

            // enter the password using send keys
            MobileElement password = (MobileElement) driver.findElement(Locators.password);
            password.sendKeys("password");

            // enter confirm password using send keys
            MobileElement confirmPassword = (MobileElement) driver.findElement(Locators.confirmPassword);
            confirmPassword.sendKeys("password");

            // click on the currency drop down
            MobileElement selectCurrency = (MobileElement) driver.findElement(Locators.selectCurrency);
            selectCurrency.click();

            // select the currency
            MobileElement currencyType = (MobileElement) driver.findElement(Locators.currencyType);
            currencyType.click();

            // click on register button
            MobileElement register = (MobileElement) driver.findElement(Locators.register);
            register.click();
        }
        // handles the exception
        catch(Exception e){
            // print the stack trace pf exception to the console
            e.printStackTrace();
        }
    }
    @Given("User enter the {string} and {string}")
    public void loginCredentials(String username, String password){
        // try and catch block to handle the exception
        try{
            // send username by taking id
            MobileElement user = (MobileElement) driver.findElement(Locators.username);
            user.sendKeys(username);
            // send password by taking id
            MobileElement pass = (MobileElement) driver.findElement(Locators.passwordForLogin);
            pass.sendKeys(password);
        }
        // handles the exception
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    @When("User clicks on login button")
    public void clickOnLogin(){
        // try and catch block to handle the exception
        try{
            // click on the login button
            MobileElement loginButton = (MobileElement) driver.findElement(Locators.loginButton);
            loginButton.click();
        }
        // handles the exception
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    @Then("^User close the page$")
    public void tearDown(){
        // close the driver
        driver.quit();
    }
}
