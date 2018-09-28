package step_definitions;

import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignIn {

    @When("^User opens signin page$")
    public void user_opens_signin_page() throws Throwable {
        Assert.assertEquals(1,1);
    }

}
