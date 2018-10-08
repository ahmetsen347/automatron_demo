package selenium_helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumHelperLocal {
    private WebDriver driver;

    public SeleniumHelperLocal(String baseUrl){
        System.setProperty("webdriver.chrome.driver", "C:/hackathon/webdrivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
