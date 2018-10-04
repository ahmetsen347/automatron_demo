package page_actions;

import helpers.ScreenshotHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.MainPage;

import java.util.concurrent.TimeUnit;

public class MainPageActions {
    static final Logger applicationLogger = Logger.getLogger("applicationLogger");

    WebDriver driver;
    MainPage mainPage;

    private void getDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\hackathon\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://finanswebde.com/");
    }

    public void openSiteAndCloseNotificationPopup(){
        getDriver();
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
