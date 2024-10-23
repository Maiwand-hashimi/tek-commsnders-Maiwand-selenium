import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocators {
    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");

        driver.manage().window().maximize();

        Thread.sleep(500);

        //Here we find the email to pass a phrase to
        By emailLocater = By.name("email");
        WebElement emailElement = driver.findElement(emailLocater);
        emailElement.sendKeys("facebooklogin@gmail.com");

        //Same we do with password
        By passLocater = By.name("pass");
        WebElement passElement = driver.findElement(passLocater);
        passElement.sendKeys("MyPassKey");

        //And then automate a login clicker
        By loginButton = By.name("login");
        driver.findElement(loginButton).click();

        Thread.sleep(1000);
        driver.quit();






    }
}
