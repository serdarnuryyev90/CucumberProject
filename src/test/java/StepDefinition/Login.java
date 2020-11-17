package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Login {
    WebDriver driver;

    @Given("Navigate to Website")
    public void navigate_to_website() {

        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("Enter user and password")
    public void enter_user_and_password() {
//       WebElement InputUsername = driver.findElement(By.id("username"));
//        WebElement InputPassword = driver.findElement(By.id("password"));
//
//        InputUsername.sendKeys("mulladiyev1988@gmail.com");
//        InputPassword.sendKeys("Ser214807");
//        driver.findElement(By.id("loginBtn")).click();


    }


}
//*[@id="block_top_menu"]/ul/li[2]/a