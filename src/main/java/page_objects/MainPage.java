package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_utils.PageObject;

public class MainPage extends PageObject {

    @FindBy(id="nav-flyout-yourAccount")
    private WebElement signinButton;

    @FindBy(tagName = "option")
    private WebElement searchDropdownbox;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton(){
        signinButton.click();
    }

    public String validateSignedIn(){
        return searchDropdownbox.getText();
    }
}
