import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {
    public static void main(String[] args) throws InterruptedException {


        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://tek-retail-ui.azurewebsites.net/");

        chromeDriver.manage().window().maximize();

        By signinLink = By.id("signinLink");
        WebElement signInElement = chromeDriver.findElement(signinLink);
        signInElement.click();

        By emailLocater = By.name("email");

        WebElement emailElement = chromeDriver.findElement(emailLocater);
        emailElement.sendKeys("TekLogginAttempt@gmail.com");

        By passLocater = By.name("password");

        WebElement passElement = chromeDriver.findElement(passLocater);
        passElement.sendKeys("MyPassKey");

        By loginButton = By.name("login");

        chromeDriver.findElement(loginButton).click();

        Thread.sleep(1000);

        chromeDriver.quit();










    }
}
