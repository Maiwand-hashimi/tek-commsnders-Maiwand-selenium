import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        Thread.sleep(1500);
        By Electronics = By.xpath("/html/body/div/div/div[1]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/img");
        driver.findElement(Electronics).click();

        Thread.sleep(1500);
        By VideoGames = By.xpath("/html/body/div/div/div[1]/div[3]/div[1]/div[1]/img");
        driver.findElement(VideoGames).click();


        Thread.sleep(1500);
        By PlayStation5 = By.xpath("/html/body/div/div/div[1]/div[3]/div/div[1]/div[2]/h1");
        String Ps5Title = driver.findElement(PlayStation5).getText();
        System.out.println(Ps5Title);

        Thread.sleep(1000);
        driver.quit();












    }
}
