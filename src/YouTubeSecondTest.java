import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
public class YouTubeSecondTest {
    public static void main(String[] args) {
        // Configuración del driver
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            // Ir a YouTube
            driver.get("https://www.youtube.com");

            // Buscar un tema
            WebElement searchBox = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.name("search_query"))
            );
            String busqueda = "Tutorial Selenium Java";
            searchBox.sendKeys(busqueda);
            searchBox.sendKeys(Keys.ENTER);
            System.out.println("Buscando: " + busqueda);

            // Esperar a que aparezcan los resultados
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
            Thread.sleep(2000);

            // Scrollear para cargar más resultados
            int scrolls = 5;
            for (int i = 1; i <= scrolls; i++) {
                js.executeScript("window.scrollBy(0, 1000);");
                System.out.println("Scroll número " + i);
                Thread.sleep(2000);
            }

            // Obtener todos los títulos de video
            List<WebElement> videos = driver.findElements(By.id("video-title"));
            videos.removeIf(v -> v.getAttribute("href") == null); // eliminar elementos sin enlace

            if (videos.isEmpty()) {
                System.out.println("❌ No se encontraron videos válidos.");
                return;
            }

            // Elegir un video aleatorio
            Random random = new Random();
            WebElement videoRandom = videos.get(random.nextInt(videos.size()));
            String videoTitle = videoRandom.getAttribute("title");

            // Scroll hasta el video elegido
            js.executeScript("arguments[0].scrollIntoView(true);", videoRandom);
            Thread.sleep(1000);

            // Subir un poco para que el header no tape el elemento
            js.executeScript("window.scrollBy(0, -150);");
            Thread.sleep(1000);

            System.out.println("Reproduciendo video aleatorio: " + videoTitle);

            // Intentar clic normal, si falla usar JavaScript
            try {
                videoRandom.click();
            } catch (org.openqa.selenium.ElementClickInterceptedException e) {
                System.out.println("El clic fue interceptado, intentando con JavaScript...");
                js.executeScript("arguments[0].click();", videoRandom);
            }

            // Esperar que el video cargue
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("video")));
            System.out.println("El video comenzó a reproducirse correctamente ✅");

            // Esperar unos segundos para “ver” el video
            Thread.sleep(15000); // ver el video 15 segundos

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //  Cerrar el navegador
            driver.quit();
            System.out.println("Prueba finalizada 🎬");
        }

    }
}
