package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import page_objects.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    MainPage mainPage;

    private void getDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\hackathon\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://finanswebde.com/");
    }

    @When("^user opens signin page see login button$")
    public void user_opens_signin_page_see_login_button() throws Throwable {
        getDriver();
        new MainPage(driver);
        mainPage.closeNotificationQuestionPopup();
        Assert.assertEquals(false, mainPage.validateNotLoggedInMainPage());
    }

    @When("^user clicks login button a login popup should opens$")
    public void user_clicks_login_button_a_login_popup_should_opens() throws Throwable {
        mainPage.clickMainLoginButton();
        Assert.assertEquals(true,mainPage.validateLoginPopup());
    }

    @When("^user enters email to \"([^\"]*)\" and password to \"([^\"]*)\"$")
    public void user_enters_email_to_and_password_to(String arg1, String arg2) throws Throwable {
        mainPage.setEmailTextbox(arg1);
        mainPage.setPasswordTextbox(arg2);
    }

    @When("^clicks login button$")
    public void clicks_login_button() throws Throwable {
        mainPage.clickLoginPopupLoginButton();
    }

    @Then("^user successfuly logged in and see main page$")
    public void user_successfuly_logged_in_and_see_main_page() throws Throwable {
        Assert.assertEquals(true, mainPage.validateNotLoggedInMainPage());
    }
}
