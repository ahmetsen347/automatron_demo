package selenium_helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SeleniumHelper{
    private WebDriver driver;
    private String browser;
    private String baseUrl;

    public SeleniumHelper(String browser, String baseUrl) throws MalformedURLException {
        this.browser = browser;
        this.baseUrl = baseUrl;

        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", "C:/hackathon/webdrivers/chromedriver.exe");
            this.driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            System.setProperty("webdriver.gecko.driver", "C:/hackathon/webdrivers/geckodriver.exe");
            this.driver = new FirefoxDriver(firefoxOptions);
        } else {
            EdgeOptions edgeOptions = new EdgeOptions();
            System.setProperty("webdriver.edge.driver", "C:/hackathon/webdrivers/MicrosoftWebDriver.exe");
            this.driver = new EdgeDriver(edgeOptions);
        }

        this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
