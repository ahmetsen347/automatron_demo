package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import page_actions.MainPageActions;

public class LoginSteps {
    MainPageActions mainPageActions = new MainPageActions();

    @When("^user opens signin page see login button$")
    public void user_opens_signin_page_see_login_button() throws Throwable {
        mainPageActions.openSiteAndCloseNotificationPopup();
    }

    @When("^user clicks login button a login popup should opens$")
    public void user_clicks_login_button_a_login_popup_should_opens() throws Throwable {
        Assert.assertEquals(true, mainPageActions.clickMainLoginButton());
    }

    @When("^user enters email to \"([^\"]*)\" and password to \"([^\"]*)\"$")
    public void user_enters_email_to_and_password_to(String arg1, String arg2) throws Throwable {
        mainPageActions.setEmailAndPasswordTextbox(arg1, arg2);
    }

    @When("^clicks login button$")
    public void clicks_login_button() throws Throwable {
        mainPageActions.clickLoginPopupLoginButton();
    }

    @Then("^user successfuly logged in and see main page$")
    public void user_successfuly_logged_in_and_see_main_page() throws Throwable {
        Assert.assertEquals(true, mainPageActions.validateNotLoggedInMainPage());
    }
}
