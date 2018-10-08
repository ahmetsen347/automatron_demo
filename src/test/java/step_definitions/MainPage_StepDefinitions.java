package step_definitions;

import cucumber.api.java.en.Given;
import page_actions.MainPage_Actions;

public class MainPage_StepDefinitions {
    MainPage_Actions mainPageActions = new MainPage_Actions();

    @Given("^user clicks login popup close button$")
    public void userClicksLoginPopupCloseButton() throws Throwable {
        mainPageActions.clickLoginPopupCloseButton();
    }
}
