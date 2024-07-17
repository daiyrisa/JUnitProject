package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utilites.Driver;

public class homePageTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://cashwise.us/main");

        HomePage homePage = new HomePage();
        homePage.login("isaevdaiyrr@gmail.com","Daiyr.50534");
    }
}
