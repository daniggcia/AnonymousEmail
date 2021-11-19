package Prueba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Email {
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void myFirstTest() {

        WebDriverManager.chromedriver().version("95").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.get("http://www.emkei.cz");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        wait = new WebDriverWait(driver, 1);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fromname']"))).sendKeys("Montzerrat Vilanova Gertru");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='from']"))).sendKeys("usuariosifp@gruposplaneta.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='subject']"))).sendKeys("Impago cuotas mensuales Inocencio Bielo Bomala");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rcpt']"))).sendKeys("daniggcia@hotmail.com@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='text']"))).sendKeys("Grupos Planeta\r\n" +
                "\r\n" +
                "\r\n" +
                "Apreciado Alumno:\r\n" +
                "\r\n" +
                "Inocencio Bomala\r\n" +
                "Y456779B\r\n" +
                "Parla - Madrid\r\n" +
                "\r\n" +
                "Le informamos que tiene pendientes varias cuotas de su grado superior de diseño de aplicaciones multiplataforma. Hasta que no ponga al día el estado de sus cuotas impagadas lamentamos comunicarle que no podemos entregarle el boletín de notas del último semestre y por lo tanto tampoco podremos convalidar su grado.\r\n" +
                "Para gestionar esta incidencia acuda al departamento de administración de C/ Julian Camarillo o llame al 91.272.95.00 \r\n" +
                "\r\n" +
                "Monzerrat Vilanova\r\n" +
                "Directora estudios Grupos Planeta");


//
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn sbold slarger']"))).click();



        // example how to click
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Buscar con Google']"))).click();
    }


}
