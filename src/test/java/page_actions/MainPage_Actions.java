package page_actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.MainPage;
import selenium_helpers.SeleniumDriver;

public class MainPage_Actions{
    static final Logger applicationLogger = Logger.getLogger("applicationLogger");
    WebDriver driver = SeleniumDriver.baseDriver;
    MainPage mainPage = new MainPage(driver);

    public void openSiteAndCloseNotificationPopup(){
        mainPage.closeNotificationQuestionPopup();
    }

    public boolean clickMainLoginButton(){
        mainPage.clickMainLoginButton();
        return mainPage.validateLoginPopup();
    }

    public void setEmailAndPasswordTextbox(String arg1, String arg2){
        mainPage.setEmailTextbox(arg1);
        mainPage.setPasswordTextbox(arg2);
    }

    public void clickLoginPopupLoginButton(){
        mainPage.clickLoginPopupLoginButton();
    }

    public boolean validateNotLoggedInMainPage(){
        return mainPage.validateNotLoggedInMainPage();
    }

    public void clickLoginPopupCloseButton(){
        mainPage.clickLoginPopupCloseButton();
    }
}
