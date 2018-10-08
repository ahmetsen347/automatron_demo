package page_objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    @FindBy(xpath = "//*[@id=\"onesignal-popover-cancel-button\"]")
    private WebElement notificationQuestionPopupCancelButton;

    @FindBy(xpath = "//*[@id=\"navbar\"]/button")
    private WebElement mainLoginButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div")
    private WebElement loginPopup;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div/div[2]/div/fieldset/div[1]/div/form/input")
    private WebElement emailTextbox;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div/div[2]/div/fieldset/div[2]/div/form/input")
    private WebElement passwordTextbox;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div/div[2]/div/fieldset/div[4]/div/button")
    private WebElement loginPopupLoginButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div/div[1]/button")
    private WebElement loginPopupCloseButton;

    // Actions
    public void closeNotificationQuestionPopup(){
        notificationQuestionPopupCancelButton.click();
    }

    public boolean validateNotLoggedInMainPage(){
        return mainLoginButton.isDisplayed();
    }

    public void clickMainLoginButton(){
        mainLoginButton.sendKeys(Keys.TAB);
        mainLoginButton.sendKeys(Keys.TAB);
        mainLoginButton.sendKeys(Keys.ENTER);
    }

    public boolean validateLoginPopup(){
        return loginPopup.isDisplayed();
    }

    public void setEmailTextbox(String email){
        emailTextbox.clear();
        emailTextbox.sendKeys(email);
    }

    public void setPasswordTextbox(String password){
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
    }

    public void clickLoginPopupLoginButton(){
        loginPopupLoginButton.click();
    }

    public void clickLoginPopupCloseButton(){
        loginPopupCloseButton.click();
    }
}
