import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTubeTest {
    public static void main(String[] args) {
        // Ruta de chromedriver
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Espera
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Ir a YouTube
            driver.get("https://www.youtube.com");

            // Buscar “Selenium tutorial”
            WebElement searchBox = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.name("search_query"))
            );
            searchBox.sendKeys("Selenium tutorial");
            searchBox.sendKeys(Keys.ENTER);

            // Esperar a que aparezcan los resultados
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));

            Thread.sleep(3000);

            // Hacer clic en el primer resultado
            WebElement firstResult = driver.findElements(By.id("video-title")).get(1);//get(0) suele ser publicidad
            String videoTitle = firstResult.getAttribute("title");
            System.out.println("Abriendo el video: " + videoTitle);
            firstResult.click();

            // Esperar que el video cargue
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("video")));

            System.out.println("El video comenzó a reproducirse correctamente ✅");
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
