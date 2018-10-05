package page_actions;

import helpers.ScreenshotHelper;
import helpers.SeleniumHelperLocal;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.MainPage;

public class MainPageActions {
    static final Logger applicationLogger = Logger.getLogger("applicationLogger");

    //*** // For Remote Parallel Executions

    //WebDriver driver = SeleniumDriver.baseDriver;

    //***


    //*** // For Local Executions
    SeleniumHelperLocal seleniumHelperLocal = new SeleniumHelperLocal("https://finanswebde.com/");
    WebDriver driver = seleniumHelperLocal.getDriver();
    //***

    MainPage mainPage;

    public void openSiteAndCloseNotificationPopup(){
        mainPage = new MainPage(driver);
        mainPage.closeNotificationQuestionPopup();
        ScreenshotHelper.takeScreenshot(driver, "DenemeBu");
        applicationLogger.info("Selenium Web Driver Successfully Created");
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
}
