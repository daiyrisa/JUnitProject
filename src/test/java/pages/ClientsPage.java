package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import java.util.logging.XMLFormatter;

public class ClientsPage {
    WebDriver driver;

    public ClientsPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy(id= "name_input_text")
    public WebElement searchBar;

    @FindBy(xpath = "//span[text()='List is empty']")
    public WebElement listIsEmptytText;

    public void search(String stringToSearch){
        searchBar.sendKeys(stringToSearch+ Keys.ENTER);
    }
}
