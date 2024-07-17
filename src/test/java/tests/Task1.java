package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Task1.Task1pages;
import utilites.Driver;

import java.util.List;


public class Task1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.eatthismuch.com/");
        Task1pages task1pages = new Task1pages(driver);

        task1pages.selectVegetarian();
        task1pages.enterCalories("1000");
        task1pages.selectMeals("4 meals");
        task1pages.clickGenerate();
    }

    // Go to "https://www.eatthismuch.com/"
    //2. Validate that the title of the page is "The Automatice Meal Planner - Eat This Much"
    //3. Choose "Vegetarian" from diet options
    //4. Enter 1000 in calories
    //5. Choose "4 meals" in dropdown and then click "Generate" button
    //6. In today's meal plan the calorie result should be not less than to 100 or not more than 100 from 1000
    //7. Store the result calorie in integer container
    //8. Validate that meals are Breakfast, Lunch, Dinner, Snack
    //9. There is a calorie underneath of each meal time,
    // validate that the sum of the calories is equal to the result calorie which is on top
    // (you have to convert String to integer, to make the comparison)

    @Test
    public void task1() {
        Driver.getDriver().get("https://www.eatthismuch.com/");

        Driver.getDriver().findElement(By.xpath("//label[contains(text(),'Vegetarian')]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@id=\"cal_input\"]")).sendKeys("1000");

        Driver.getDriver().findElement(By.id("num-meals-select"));

        Driver.getDriver().findElement(By.xpath("//option[contains(text(),'4 meals')]")).click();


    }

    @Test
    public void task() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/tables");
        List<WebElement> firstname = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[1]"));
        List<WebElement> lastname = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[2]"));
        List<WebElement> due = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[4]"));

        for (int i = 1; i < firstname.size(); i++) {
            System.out.println(firstname.get(i).getText() + " " + lastname.get(i).getText() + due.get(i).getText());

        }
    }


    @Test
    public void morethan50() {

        Driver.getDriver().get("https://the-internet.herokuapp.com/tables");
        List<WebElement> firstname = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[1]"));
        List<WebElement> lastname = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[2]"));
        List<WebElement> due = Driver.getDriver().findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[4]"));


        for (int i = 1; i < due.size(); i++) {
            if (Double.parseDouble(due.get(i).getText().substring(1)) > 50) {
                System.out.println(firstname.get(i).getText() + " " + lastname.get(i).getText() + " " + due.get(i).getText());

            }

        }
    }}


//    public void task3(){
//        @Test
//        public void Second(){
//
//            Driver.getDriver().get("https://demo.guru99.com/test/table.html");
//
//            SecondColumn secondColumn = new SecondColumn();
//
//            for(int i = 0; i < secondColumn.secondN.size(); i++){
//                System.out.println(secondColumn.secondN.get(i).getText());
//            }
//
//        }
//
//    }