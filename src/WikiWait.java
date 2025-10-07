import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikiWait {
    public static void main(String[] args) throws InterruptedException {
        // Ruta de chromedriver
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Instancia de Chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.wikipedia.org/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("searchInput"));

        searchBox.sendKeys("Java");
        Thread.sleep(3000);
        searchBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading")));

        System.out.println("✅ Página cargada: " + heading.getText());
        Thread.sleep(10000);
        driver.quit();

    }
}
