package helpers;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotHelper {
    private final static Logger applicationLogger = Logger.getLogger("applicationLogger");
    private static String currentDate;
    private static String fileName;

    public static void takeScreenshot(WebDriver driver, String stepDef){
        currentDate = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
        fileName = String.format("C://automatronscr//scr_%1s_%2s.jpg", currentDate, stepDef);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(fileName));
        } catch (IOException e) {
            applicationLogger.error(e);
        }
        currentDate = "";
        fileName = "";
    }
}
