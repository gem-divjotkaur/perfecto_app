package locators;

import org.openqa.selenium.By;

public class Locators {
    // In this class , add all the locators which are supposed to be used in step definitions class
    public static By signup = By.id("io.perfecto.expense.tracker:id/login_signup_btn");
    public static By name = By.id("io.perfecto.expense.tracker:id/signup_name");
    public static By email = By.id("io.perfecto.expense.tracker:id/signup_email");
    public static By password = By.id("io.perfecto.expense.tracker:id/signup_password");
    public static By confirmPassword = By.id("io.perfecto.expense.tracker:id/signup_confirm_password");
    public static By selectCurrency = By.id("android:id/text1");
    public static By currencyType = By.xpath("//android.widget.TextView[@text='INR-₹']");
    public static By register = By.id("io.perfecto.expense.tracker:id/signup_save_btn");

    public static By username = By.id("io.perfecto.expense.tracker:id/login_email");
    public static By passwordForLogin = By.id("io.perfecto.expense.tracker:id/login_password");

    public static By loginButton = By.id("io.perfecto.expense.tracker:id/login_login_btn");
}
