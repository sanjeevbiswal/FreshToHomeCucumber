package stepDefs.HomepageTest;

import PageObjects.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import stepDefs.BeforeAfter;

/**
 * Created by SB00430588 on 5/5/2016.
 */
public class HomepageTest {
    public Homepage homepage;
    public WebDriver driver;

    public HomepageTest(){
        driver= BeforeAfter.driver;
        homepage=PageFactory.initElements(driver, Homepage.class);
    }
    @Given("^User is in homepage$")
    public void user_is_in_homepage() throws Throwable {
        driver.get("https://www.freshtohome.com/");
        homepage.cityBangalore.click();
    }

    @Then("^Title should contains \"([^\"]*)\"$")
    public void title_should_contains(String pageTitle) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(pageTitle));
    }


}
