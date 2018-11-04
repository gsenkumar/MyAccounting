package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import sun.security.util.PendingException;

/**
 * Created by aikkiasenthil on 28/10/2018.
 */
public class LoginTest {

    String usrname = "senthilteck@gmail.com";
    String password = "Nila12345";

    public WebDriver driver;

    LoginPage loginPage = new LoginPage(driver);

    @Given("^open the NixonWilliam login URL$")
    public void open_the_NixonWilliam_login_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        loginPage.openUrl();
    }

//    @When("^the valid login credentials provided$")
//    public void the_valid_login_credentials_provided() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        loginPage.enterUsername(usrname);
//        loginPage.enterPassword(password);
//        loginPage.submit();
//    }

    @When("^the valid \"([^\"]*)\" and \"([^\"]*)\" provided$")
    public void the_valid_login_credentials_provided(String usr, String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterUsername(usr);
        loginPage.enterPassword(pass);
        loginPage.submit();
    }

    @Then("^the respective account home page opened$")
    public void the_respective_account_home_page_opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.getTitle();
    }
}
