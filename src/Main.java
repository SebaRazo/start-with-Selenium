import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Ruta de chromedriver
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        if (driverPath == null) {
            System.out.println("❌ ERROR: La variable de entorno CHROMEDRIVER_PATH no está definida.");
            return;
        }
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Instancia de chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("River Plate");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        if (pageTitle.toLowerCase().contains("wikipedia")) {
            System.out.println("✅ Test Passed: La búsqueda funcionó.");
        } else {
            System.out.println("❌ Test Failed: El título no es correcto.");
        }


    }

    }