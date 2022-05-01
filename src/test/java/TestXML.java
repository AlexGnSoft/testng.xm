import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestXML {

    WebDriver driver;

    @BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Automation");
        element.sendKeys(Keys.ENTER);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
