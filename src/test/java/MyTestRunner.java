import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;
import selenium_helpers.SeleniumDriver;
import selenium_helpers.SeleniumHelper;

@CucumberOptions(
        monochrome = false,
        strict = false,
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        tags = {"~@Ignore"},
        format = {"pretty",
                "json:target/cucumber.json",
        })
public class MyTestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void setUpClass(String browser, String url) throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        SeleniumHelper seleniumHelper = new SeleniumHelper(browser, url);
        SeleniumDriver.baseDriver = seleniumHelper.getDriver();
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
        if(SeleniumDriver.baseDriver != null){
            SeleniumDriver.baseDriver.manage().deleteAllCookies();
            SeleniumDriver.baseDriver.quit();
        }
    }
}

