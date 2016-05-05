package stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by SB00430588 on 4/27/2016.
 */
public class BeforeAfter {
    public static WebDriver driver;

    @Before
    public void openBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
            scenario.write(scenario.getName()+"   "+scenario.getStatus());

        if(driver!=null){
            //driver.close();
        }
    }

    public static void takeScreenshot(String methodName) throws IOException {
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./screenshot"+methodName+".jpg"));
    }
}
