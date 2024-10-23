import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocater {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://tek-retail-ui.azurewebsites.net/");

        chromeDriver.manage().window().maximize();

        By signinLink= By.id("signinLink");

        WebElement signInElement = chromeDriver.findElement(signinLink);

        signInElement.click();

        Thread.sleep(1000);

        By subTitleLocater = By.className("login__subtitle");
        WebElement subtitleElement = chromeDriver.findElement(subTitleLocater);

        String text = subtitleElement.getText();

        System.out.println(text);

        chromeDriver.quit();



    }
}
