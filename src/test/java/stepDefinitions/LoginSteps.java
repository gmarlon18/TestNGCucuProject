package stepDefinitions;

import TestBase.BaseT;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps extends BaseT {

    @Before()
    public void doSomethingBefore(){
        driver = chromedriverConnection(); //Genera nuevo driver
    }

    @Given("On Browser I access demo web")
    public void on_Browser_I_access_demo_web() {
        getDriverWeb(); //URL
    }

    @When("I click on login icon locate at menu screen")
    public void i_click_on_login_icon_locate_at_menu_screen() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();

    }

    @When("Put the credentials")
    public void put_the_credentials() {
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(User);

        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pass);

    }

    @When("We click button login")
    public void we_click_button_login() {

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("We reach the home page of a signed user")
    public void we_reach_the_home_page_of_a_signed_user() {
        Assert.assertTrue(getTextTitle(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3")).contains("Hi, Demo User"));
    }

    @When("Put user invalid credentials")
    public void put_user_invalid_credentials() {
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("usuarioInvalido");

        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asd");
    }

    @Then("System show message of invalid user")
    public void system_show_message_of_invalid_user() {
        Assert.assertTrue(getTextTitle(By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/div[1]/div")).contains("Invalid Email or Password"));
    }

    @After
    public void doSomethingAfter(){
        AfterClass();
    }









}
