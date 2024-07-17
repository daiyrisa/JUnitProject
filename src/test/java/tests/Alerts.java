package tests;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.Driver;
import utilites.SeleniumUtils;

import static utilites.Driver.getDriver;
import static utilites.Driver.getDriver;

public class Alerts {

//    @Test
//            public void validate(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/delete_customer.php");
//
//        driver.findElement(By.name("cusid")).sendKeys("1235");
//        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
//
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().getText().equals("Customer Successfully Delete!");
//
//


    @Test
    public void validateAlertMessage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement input = getDriver().findElement(By.name("cusid"));
        WebElement submitButton = getDriver().findElement(By.name("submit"));
        input.sendKeys("123" + Keys.ENTER);

        getDriver().switchTo().alert().accept();
        String expectedText = "Customer Successfully Delete!";
        String actualText = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();

        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void check(){
        getDriver().get("https://demoqa.com/alerts");

        getDriver().findElement(By.id("alertButton")).click();
        getDriver().switchTo().alert().accept();

        getDriver().findElement(By.id("timerAlertButton")).click();
        SeleniumUtils.waitForSecond(6);
        getDriver().switchTo().alert().accept();

        String expectedMessage1 = "Cancel";
        getDriver().findElement(By.id("confirmButton")).click();
        getDriver().switchTo().alert().dismiss();
        String actualText1 = getDriver().findElement(By.id("confirmResult")).getText();
        Assert.assertTrue(actualText1.contains(expectedMessage1));

        String messageToSend = "Codewise";
        getDriver().findElement(By.id("promtButton")).click();
        getDriver().switchTo().alert().sendKeys(messageToSend);
        getDriver().switchTo().alert().accept();

        String actualMessage = getDriver().findElement(By.id("promptResult")).getText();

        Assert.assertTrue(actualMessage.contains(messageToSend));







    }

    @Test
    public void asserts(){
        getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        Driver.getDriver().findElement(By.name("Click for JS Alert")).click();
        Driver.getDriver().switchTo().alert().accept();

        Driver.getDriver().findElement(By.id(""));

    }

    @Test
    public void windows(){
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        SeleniumUtils.waitForSecond(3);
        String parentTab = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.id("tabButton")).click();

        for(String id : Driver.getDriver().getWindowHandles()){
            if(!id.equals(parentTab)){
                Driver.getDriver().switchTo().window(id);
                String text = Driver.getDriver().findElement(By.id("sampleHeading")).getText();
                Assert.assertTrue(text.contains("sample"));
                Driver.getDriver().close();
            }
        }

        Driver.getDriver().switchTo().window(parentTab);

    }



}
