package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class mainpage {
    public static WebDriver driver;

    @Given("^User on Main page$")
    public void user_on_main_page() throws Throwable {
       String url=Utilitypackage.commonutils.getUrl("src/test/resources/MountSinai.properties");
       driver.get(url);
    }
    @When("^user click Book online Element$")
    public void user_click_book_online_element() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/section[2]/div/div[1]/div[1]/div[2]/div[2]/a/span")).click();

    }

    @Then("^user can access doctor by location page$")
    public void user_can_access_doctor_by_location_page() throws Throwable {
        System.out.println("user on location page");

    }
}
