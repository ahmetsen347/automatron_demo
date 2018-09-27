package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_utils.PageObject;

public class SignInSecondPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(tagName = "label")
    private WebElement textboxHeader;

    @FindBy(id = "ap_password")
    private WebElement passwordTextbox;

    @FindBy(id = "signInSubmit")
    private WebElement signInSubmitButton;

    public SignInSecondPage(WebDriver driver) {
        super(driver);
    }

    public String validateHeader(){
        return header.getText();
    }

    public String validateTextboxHeader(){
        return textboxHeader.getText();
    }

    public void setPassword(String password){
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
    }

    public MainPage clickSignInSubmitButton(){
        signInSubmitButton.click();
        return new MainPage(driver);
    }
}
