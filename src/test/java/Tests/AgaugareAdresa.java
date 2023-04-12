package Tests;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class AgaugareAdresa {

    public WebDriver driver;
    @Test
    public void AdaugareAdresa() {

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

        WebElement DateFacturare = driver.findElement(By.xpath("//a[text()='Date de facturare şi livrare']"));
        DateFacturare.click();

        WebElement AdresaFacturare = driver.findElement(By.id("create-new-shipping-address"));
        AdresaFacturare.click();

        WebElement Judet = driver.findElement(By.xpath("//input[@name='county_id']/..//input[@id='NaN']"));
        Judet.sendKeys("Calarasi");
        Judet.sendKeys(Keys.ENTER);

        WebElement Telefon = driver.findElement(By.xpath("//input[@name='customer_phone']"));
        String TelefonValue = "0722222222";
        Telefon.sendKeys(TelefonValue);

        WebElement Adresa = driver.findElement(By.xpath("//input[@name='customer_street_address']"));
        String AdresaValue = "str. Belsugului, nr.1";
        Adresa.sendKeys(AdresaValue);

        WebElement Localitate = driver.findElement(By.xpath("//input[@name='city_id']/..//input[@id='NaN']"));
        Localitate.sendKeys("Dragalina");
        Localitate.sendKeys(Keys.ENTER);

        WebElement Nume = driver.findElement(By.xpath("//input[@name='customer_full_name']"));
        String NumeValue = "Velicu Ana";
        Nume.sendKeys(NumeValue);

        WebElement Salveaza = driver.findElement(By.id("add-new-address-btn"));
        Salveaza.click();




















    }

}
