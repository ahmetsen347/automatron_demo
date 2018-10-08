package selenium_helpers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumHelper{
    private WebDriver driver;
    private String browser;
    private String baseUrl;
    private String os;
    private String node;

    public SeleniumHelper(String os, String browser, String baseUrl, String node) throws MalformedURLException {
        this.os = os;
        this.browser = browser;
        this.baseUrl = baseUrl;
        this.node = node;

        Platform platform = Platform.fromString(os.toUpperCase());

        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("platform", platform);
            this.driver = new RemoteWebDriver(new URL(node), chromeOptions);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setCapability("platform", platform);
            firefoxOptions.setLegacy(true);
            this.driver = new RemoteWebDriver(new URL(node), firefoxOptions);
        } else {
            OperaOptions operaOptions = new OperaOptions();
            operaOptions.setCapability("platform", platform);
            this.driver = new RemoteWebDriver(new URL(node), operaOptions);
        }

        this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);
    }

    public String getOs() {
        return this.os;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getNode() {
        return this.node;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
