package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.time.Duration;

public class RegisterTest {
    public WebDriver driver;
    @Test
    public void RegisterUser() {

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

        WebElement Inregistrare = driver.findElement(By.cssSelector(".head-customer-dropdown-links .fa-user-plus"));
        Inregistrare.click();

        WebElement ClientNou = driver.findElement(By.id("account-new-left"));
        ClientNou.click();

        WebElement Prenume = driver.findElement(By.id("newAccount-customer_firstname"));
        String PrenumeValue = "Ana";
        Prenume.sendKeys(PrenumeValue);

        WebElement Nume = driver.findElement(By.id("newAccount-customer_lastname"));
        String NumeValue = "Velicu";
        Nume.sendKeys(NumeValue);

        WebElement Email = driver.findElement(By.id("newAccount-customer_email"));
        String EmailValue = "anna.11213141@gmail.com";
        Email.sendKeys(EmailValue);

        WebElement Parola = driver.findElement(By.id("newAccount-customer_password"));
        String ParolaValue = "calarasi2022";
        Parola.sendKeys(ParolaValue);

        WebElement ConfirmareParola = driver.findElement(By.id("newAccount-customer_confirm_password"));
        String ConfirmareParolaValue = "calarasi2022";
        ConfirmareParola.sendKeys(ConfirmareParolaValue);

        WebElement CreeazaCont = driver.findElement(By.cssSelector(".col-sm-offset-2 .btn-default"));
        CreeazaCont.click();

    }

}
