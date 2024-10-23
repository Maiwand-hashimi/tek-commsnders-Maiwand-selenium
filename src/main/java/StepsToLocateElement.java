import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsToLocateElement {
    public static void main(String[] args) throws InterruptedException {

        //Trying to make an automatic click button on the Retail app

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://tek-retail-ui.azurewebsites.net/");

        chromeDriver.manage().window().maximize();

        //First we locate the Element
        By signinLink= By.id("signinLink");

        //Then we use selenium to find the element
        WebElement signInElement = chromeDriver.findElement(signinLink);

        //Then we pass an Action
        signInElement.click();

        //Add the pause from java to slow down Selenium
        Thread.sleep(3_000);

        //And quit again so it doesn't burn the pc
        chromeDriver.quit();



    }
}
