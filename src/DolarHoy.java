import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DolarHoy {
    public static void main(String[] args) {
        // Ruta de chromedriver
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Instancia de Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dolarhoy.com/");
        // Localizamos el bloque del dólar blue
        WebElement compra = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar Blue')]]//div[@class='compra']//div[@class='val']"));
        WebElement venta = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar Blue')]]//div[@class='venta']//div[@class='val']"));
        // Localizamos el bloque del dólar oficial
        WebElement compraOficial = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar Oficial')]]//div[@class='compra']//div[@class='val']"));
        WebElement ventaOficial = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar Oficial')]]//div[@class='venta']//div[@class='val']"));
        // Localizamos el bloque del dólar mep
        WebElement compraMep = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar MEP')]]//div[@class='compra']//div[@class='val']"));
        WebElement ventaMep = driver.findElement(By.xpath("//div[@class='tile is-child'][.//a[contains(text(),'Dólar MEP')]]//div[@class='venta']//div[@class='val']"));


        System.out.println("💵 Dólar Blue - Compra: " + compra.getText() + " | Venta: " + venta.getText());
        System.out.println("💵 Dólar Oficial - Compra: " + compraOficial.getText() + " | Venta: " + ventaOficial.getText());
        System.out.println("💵 Dólar Mep - Compra: " + compraMep.getText() + " | Venta: " + ventaMep.getText());

        driver.quit();
    }
}