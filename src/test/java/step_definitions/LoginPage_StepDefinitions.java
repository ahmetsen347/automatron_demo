package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import page_actions.MainPage_Actions;

public class LoginPage_StepDefinitions {
    MainPage_Actions mainPageActions = new MainPage_Actions();

    @When("^user opens signin page see login button 1$")
    public void user_opens_signin_page_see_login_button_1() throws Throwable {
        mainPageActions.openSiteAndCloseNotificationPopup();
    }

    @When("^user clicks login button a login popup should opens 1$")
    public void user_clicks_login_button_a_login_popup_should_opens_1() throws Throwable {
        Assert.assertEquals(true, mainPageActions.clickMainLoginButton());
    }

    @When("^user enters email to \"([^\"]*)\" and password to \"([^\"]*)\" 1$")
    public void user_enters_email_to_and_password_to_1(String arg1, String arg2) throws Throwable {
        mainPageActions.setEmailAndPasswordTextbox(arg1, arg2);
    }

    @When("^clicks login button 1$")
    public void clicks_login_button_1() throws Throwable {
        mainPageActions.clickLoginPopupLoginButton();
    }

    @Then("^user successfuly logged in and see main page 1$")
    public void user_successfuly_logged_in_and_see_main_page_1() throws Throwable {
        Assert.assertEquals(true, mainPageActions.validateNotLoggedInMainPage());
    }
}
