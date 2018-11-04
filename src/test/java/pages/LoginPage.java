package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import step_definitions.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by aikkiasenthil on 28/10/2018.
 */
public class LoginPage extends Hooks {

    String URL = "https://www.nixonwilliamsvantage.com/system/login";

    public WebDriver driver;

    By txt_Username = By.id("username");
    By txt_Password = By.id("password");
    By btn_Submit = By.name("btn_submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.driver = new SafariDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public void openUrl(){
        driver.get(URL);
        getTitle();
    }

    public void enterUsername(String usr){
        driver.findElement(txt_Username).sendKeys(usr);
    }

    public void enterPassword(String pass){
        driver.findElement(txt_Password).sendKeys(pass);
    }

    public void submit(){
        driver.findElement(btn_Submit).click();

    }

    public void getTitle(){
        System.out.println(driver.getTitle());
    }
}
