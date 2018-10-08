import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//// LOCAL EXECUTIONS /////
@CucumberOptions(
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
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
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
    }
}


        //// REMOTE PARALLEL EXECUTIONS /////


/*
@CucumberOptions(
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
    @Parameters({"os", "browser", "url", "node"})
    public void setUpClass(String os, String browser, String url, String node) throws Exception {
        SeleniumHelper seleniumHelper = new SeleniumHelper(os, browser, url, node);
        SeleniumDriver.baseDriver = seleniumHelper.getDriver();
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
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
*/
