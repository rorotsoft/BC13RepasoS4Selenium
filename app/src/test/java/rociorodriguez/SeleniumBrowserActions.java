package rociorodriguez;

import bc13repasos4selenium.App;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class SeleniumBrowserActions {

    private String titulo;
    private WebDriver driver;

    @BeforeEach

    public preparacionTests(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(); //instanciar un objeto WebDriver (browser)

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    void postEjecucion() {

    }
    @Test
    void browserActions(){

        driver.get("https://www.google.cl");

        driver.manage().window().maximize();

        driver.navigate().to("https://www.selenium.dev");

        driver.navigate().refresh();

        driver.navigate().back();
    }
}

@Test
void crearCtaSpotify() {
    driver.get("https://open.spotify.com/");

    By locatorBtnIniciarSesion = By.xpath("//button[@dara-testid='login-button']");

    WebElement btnIniciarSesion = driver.findElement(locatorBtnIniciarSesion);

    btnIniciarSesion.click();



}
}
