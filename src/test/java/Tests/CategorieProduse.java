package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class CategorieProduse {
    public WebDriver driver;
    @Test
    public void Produse() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.edenboutique.ro/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement CloseReclama = driver.findElement(By.cssSelector(".fa-angle-left"));
        CloseReclama.click();

        WebElement CloseCookie = driver.findElement(By.xpath("//span[text()='Am înţeles']"));
        CloseCookie.click();

        WebElement Abonare = driver.findElement(By.cssSelector(".no-thanks"));
        Abonare.click();

        WebElement CategColiere = driver.findElement(By.xpath("//a[@title='Coliere']"));
        CategColiere.click();

        WebElement Lantisor = driver.findElement(By.xpath("//a[@title='Lantisor din argint 925']"));
        Lantisor.click();

        WebElement AdaugaCos = driver.findElement(By.id("submit_button"));
        AdaugaCos.click();

        WebElement ContinuaCump = driver.findElement(By.cssSelector(".button1"));
        ContinuaCump.click();

        WebElement CategBratari = driver.findElement(By.xpath("//a[@title='Bratari']"));
        CategBratari.click();

    }
}
