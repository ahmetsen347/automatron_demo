package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import page_objects.MainPage;
import page_objects.SignInFirstPage;
import test_utils.FunctionalTest;

public class SignInTest  extends FunctionalTest{

    MainPage mainPage;
    SignInFirstPage signInFirstPage;

    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks on signin button navigates to first signin page$")
    public void user_clicks_on_signin_button_navigates_to_first_signin_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^first sigin page initialized user see header text$")
    public void first_sigin_page_initialized_user_see_header_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user see textbox header$")
    public void user_see_textbox_header() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enters email$")
    public void user_enters_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks continue button$")
    public void user_clicks_continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user navigates to second signin page$")
    public void user_navigates_to_second_signin_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
