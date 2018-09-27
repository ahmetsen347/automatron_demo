package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_utils.PageObject;

public class SignInFirstPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(tagName = "label")
    private WebElement textboxHeader;

    @FindBy(id = "ap_email")
    private WebElement emailTextbox;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public SignInFirstPage(WebDriver driver) {
        super(driver);
    }

    public String validateHeader(){
        return header.getText();
    }

    public String validateTextboxHeader(){
        return textboxHeader.getText();
    }

    public void setEmail(String email){
        emailTextbox.clear();
        emailTextbox.sendKeys(email);
    }

    public SignInSecondPage clickContinueButton(){
        continueButton.click();
        return new SignInSecondPage(driver);
    }
}
