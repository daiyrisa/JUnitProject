package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilites.Driver;

public class LoginTests {

    LoginPage loginPage = new LoginPage();

    @Test
    public void testLoginResults(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://batch-6.studymate.us/login");

        loginPage.testLogin("admin@codewise.com","codewise123","English");
        loginPage.loginButton.click();


    }
}
