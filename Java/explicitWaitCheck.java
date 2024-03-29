/*
 * Written by Jay Ceballos
 * 6/24/22
 */

package Codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitCheck
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-arguments");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Testing");
        element.submit();

        WebDriverWaitwait = new WebDriverWait(driver, 20);

        WebElement elementTwo =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));

        elementTwo.click();
    }
}
