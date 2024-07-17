package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.TrashPage;


import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class TrashTests {

    TrashPage trashPage = new TrashPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void click2() throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://batch-6.studymate.us/login");

        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        Thread.sleep(2000);
        trashPage.trashButton.click();

        Thread.sleep(2000);
        trashPage.buttonRecovered.click();

//        Thread.sleep(2000);
//        trashPage.trashDelete.click();









    }
}