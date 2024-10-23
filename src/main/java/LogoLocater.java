import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoLocater {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://tek-retail-ui.azurewebsites.net/");

        chromeDriver.manage().window().maximize();

        Thread.sleep(1000);

        By logoLocater = By.className("top-nav__logo");
        WebElement logoElement = chromeDriver.findElement(logoLocater);
        String logoText = logoElement.getText();

        System.out.println("\nThis is the Logo Text: \n" + logoText);

        chromeDriver.quit();



    }
}
