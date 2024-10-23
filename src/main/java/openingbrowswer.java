import org.openqa.selenium.chrome.ChromeDriver;

public class openingbrowswer {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.facebook.com/login.php/");

    }
}
