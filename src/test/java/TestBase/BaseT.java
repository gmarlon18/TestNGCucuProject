package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseT {
    static public WebDriver driver;
    static public String User;
    static public String Pass;
    static protected String AppURL;


    public static WebDriver chromedriverConnection(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }


    public static void BeforeClass(String appURL, String user, String pass){
        AppURL = appURL;
        User = user;
        Pass= pass;

    }

    public static void AfterClass(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }


    //Toma el texto del titulo o elemento de la pagina
    public String getTextTitle(By locator){
        String text = driver.findElement(locator).getText();
        return text;
    }

    //Establece la direccion web que toma el Driver Selenium
    public void getDriverWeb()
    {
        driver.get(AppURL);
    }


}
