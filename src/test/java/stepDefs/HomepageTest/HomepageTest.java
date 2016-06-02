package stepDefs.HomepageTest;

import PageObjects.Homepage;
import PageObjects.SearchResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import stepDefs.BeforeAfter;

/**
 * Created by SB00430588 on 5/5/2016.
 */
public class HomepageTest {
    public Homepage homepage;
    public SearchResultsPage searchResultPage;
    public WebDriver driver;

    public HomepageTest(){
        driver= BeforeAfter.driver;
        homepage=PageFactory.initElements(driver, Homepage.class);
        searchResultPage=PageFactory.initElements(driver,SearchResultsPage.class);
    }
    @Given("^User is in 'Myntra' homepage$")
    public void user_is_in_homepage() throws Throwable {
        driver.get("http://www.myntra.com/");

    }

    @Then("^Title should contains \"([^\"]*)\"$")
    public void title_should_contains(String pageTitle) throws Throwable {
              Assert.assertTrue(driver.getTitle().contains(pageTitle));

    }


    @When("^User search for Keyword \"([^\"]*)\"$")
    public void user_Search_ForKeyword(String searchWord) throws Throwable {

        homepage.searchInputBox.sendKeys(searchWord);
    }

    @And("^Click 'Search' button$")
    public void click_Search_Button() throws Throwable {
        homepage.searchBox.click();
    }



}
