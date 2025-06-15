import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {

    @Test
    public void firstTest(){
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.get("https://www.leafground.com/dashboard.xhtml");

        //enter value for Text input
        //xpath - //label[contains(text(),'Text input')]//following-sibling::input
        //WebElement textInput = driver.findElement(By.xpath("//label[contains(text(),'Text input')]//following-sibling::input"));
        WebElement textInput = driver.findElement(By.xpath("//input[@name='email']"));
        textInput.sendKeys("pasan");

        //driver.quit();
    }
}
