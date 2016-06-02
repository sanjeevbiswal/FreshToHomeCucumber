package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SB00430588 on 5/5/2016.
 */
public class Homepage {
    public WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Bangalore']")
    public WebElement cityBangalore;

    @FindBy(xpath = "//input[@id='q']")
    public WebElement searchInputBox;

    @FindBy(css = ".header-sprite.icon-search")
    public WebElement searchBox;
}
