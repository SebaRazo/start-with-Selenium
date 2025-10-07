import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaAccount {
    public static void main(String[] args) throws InterruptedException {
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Instancia de Chrome
        WebDriver driver = new ChromeDriver();

        //driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount");
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        //Cambiando a version en Inglés
        WebElement englishLink = driver.findElement(By.id("js-link-box-en"));
        Thread.sleep(1000);
        englishLink.click();
        System.out.println("Entrando a Wikipedia en inglés...");
        Thread.sleep(2000);

        //Seleccionamos CreateAccount
        WebElement createAccountLink = driver.findElement(By.linkText("Create account"));
        createAccountLink.click();
        System.out.println("📝 Navegando a la página de crear cuenta...");
        Thread.sleep(2000);
        //Completamos Formualrio
        WebElement username = driver.findElement(By.id("wpName2"));
        WebElement password = driver.findElement(By.id("wpPassword2"));
        WebElement confirm = driver.findElement(By.id("wpRetype"));
        WebElement email = driver.findElement(By.id("wpEmail"));

        username.sendKeys("MiUsuarioDePrueba");
        System.out.println("👤 Usuario completado");
        Thread.sleep(1000);

        password.sendKeys("ContraseñaSegura123!");
        System.out.println("🔑 Contraseña completada");
        Thread.sleep(1000);

        confirm.sendKeys("ContraseñaSegura123!");
        System.out.println("✅ Confirmación completada");
        Thread.sleep(1000);

        email.sendKeys("usuario@ejemplo.com");
        System.out.println("📧 Email completado");
        Thread.sleep(1000);

        System.out.println("🎉 Formulario completo - (sin enviar)");

        // Cerrar navegador
        Thread.sleep(5000);
        driver.quit();


    }
}
