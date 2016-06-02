package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Aryan on 6/3/2016.
 */
public class SearchResultsPage {

    public WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='queried-for']/h1")
    public WebElement searchItem;
}
