package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    public WebDriver driver;
    @Test
    public void Autentificare() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://www.edenboutique.ro/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement CloseReclama = driver.findElement(By.cssSelector(".fa-angle-left"));
        CloseReclama.click();

        WebElement CloseCookie = driver.findElement(By.xpath("//span[text()='Am înţeles']"));
        CloseCookie.click();

        WebElement Abonare = driver.findElement(By.cssSelector(".no-thanks"));
        Abonare.click();

        WebElement ContulMeu = driver.findElement(By.xpath("//span[text()='Contul meu']"));
        ContulMeu.click();

        WebElement Autentificare = driver.findElement(By.cssSelector(".head-customer-dropdown-links .fa-sign-in-alt"));
        Autentificare.click();

        WebElement Email = driver.findElement(By.id("email"));
        String EmailValue = "anna.11213141@gmail.com";
        Email.sendKeys(EmailValue);

        WebElement Parola = driver.findElement(By.id("parola"));
        String ParolaValue = "calarasi2022";
        Parola.sendKeys(ParolaValue);

        WebElement AutentificareCont = driver.findElement(By.cssSelector(".col-md-offset-3 .btn-default"));
        AutentificareCont.click();


    }

}
