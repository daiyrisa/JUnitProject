package pages.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class Task1pages {
    WebDriver driver;
    public Task1pages(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//label[contains(text(),'Vegetarian')]")
    WebElement vegetarianoption;

    @FindBy(id = "target-calories-input")
    WebElement calorieinput;

    @FindBy(id = "num-meals-select")
    WebElement mealsdropdown;

    @FindBy(id = "generate-button")
    WebElement generatebutton;

    public void selectVegetarian() {
        vegetarianoption.click();
    }

    public void enterCalories(String calories) {
        calorieinput.clear();
        calorieinput.sendKeys(calories);
    }

    public void selectMeals(String numberOfMeals) {
        mealsdropdown.findElement(By.xpath("//option[contains(text(),'" + numberOfMeals + "')]")).click();
    }

    public void clickGenerate() {
        generatebutton.click();
    }






    }

