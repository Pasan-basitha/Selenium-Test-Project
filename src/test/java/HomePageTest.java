import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class HomePageTest {

    @Test
    public void firstTest(){
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        ChromeOptions options = new ChromeOptions();



        String seleniumUrl = System.getenv("SELENIUM_REMOTE_URL");
        if (seleniumUrl == null || seleniumUrl.isEmpty()) {
            // Default to localhost for local development
            seleniumUrl = "http://localhost:4444/wd/hub";
        }

        URI uri = URI.create(seleniumUrl);
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(uri.toURL(), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        driver.get("https://www.leafground.com/dashboard.xhtml");

        //enter value for Text input
        //xpath - //label[contains(text(),'Text input')]//following-sibling::input
        //WebElement textInput = driver.findElement(By.xpath("//label[contains(text(),'Text input')]//following-sibling::input"));
        WebElement textInput = driver.findElement(By.xpath("//input[@name='email']"));
        textInput.sendKeys("pasan");

        //driver.quit();
    }
}
